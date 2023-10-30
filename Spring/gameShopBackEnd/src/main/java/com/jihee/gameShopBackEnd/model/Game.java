package com.jihee.gameShopBackEnd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "games")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String title;
	@Column
	private String genre;
	@Column
	private int price;
	@Column
	private String image;
	@Column
	private String text;
	
	// 기본 생성자 만들기
	// 오른쪽 마우스 클릭 > source > Generate Constructor using Fields > 오른쪽의 Deselect all 선택 후 Generate
	public Game() {
		super();
	}
	
	// 생성자 만들기
	// 오른쪽 마우스 클릭 > source > Generate Constructor using Fields > 전부 선택 후 Generate
	public Game(long id, String title, String genre, int price, String image, String text) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.image = image;
		this.text = text;
	}

	// Getter & Setter 만들기
	// 오른쪽 마우스 클릭 > source > Getters and Setters 클릭 > 모두 선택 후 Generate
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


	
}
