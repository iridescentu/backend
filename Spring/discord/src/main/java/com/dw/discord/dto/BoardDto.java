package com.dw.discord.dto;

import jakarta.validation.constraints.NotBlank;

// 게시판 Dto
public class BoardDto {
	
	@NotBlank
	private String author;
	
	@NotBlank
	private String title;
	
	@NotBlank
	private String text;
	
	@NotBlank
	private String category;

	// 기본 생성자
	public BoardDto() {
		super();
	}

	// 전체 생성자
	public BoardDto(@NotBlank String author, @NotBlank String title, @NotBlank String text,
			@NotBlank String category) {
		super();
		this.author = author;
		this.title = title;
		this.text = text;
		this.category = category;
	}

	
	// Getters and Setters
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
	

	
}
