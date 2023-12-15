package com.dw.discord.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "board")
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String author;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false, length = 1500)
	private String text;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false, updatable = false) // 글자가 만들어지는 시점이 업데이트가 되면 안 됨, 저장이 되어야 하기 때문에. 그래서 업데이트를 막기 위해 updatable = false 사용.
	@Temporal(TemporalType.TIMESTAMP) // 글이 작성되는 시점을 저장하기 위해 TIMESTAMP를 사용함
	private LocalDateTime createAt;
	
	// 기본 생성자
	public Board() {
		super();
	}
	
	// 전체 생성자
	public Board(Long id, String author, String title, String text, String category, LocalDateTime createAt) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.text = text;
		this.category = category;
		this.createAt = createAt;
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}
	
}
