package com.jihee.gameShopBackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "purchase")
public class Purchase {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Game game;
	
	private int quantity;

	// source → Generate Constructor using Fields → 아무것도 체크하지 않고 Generate
	public Purchase() {
		super();
	}

	// source → Generate Constructor using Fields → 전부 체크하고 Generate
	public Purchase(long id, Game game, int quantity) {
		super();
		this.id = id;
		this.game = game;
		this.quantity = quantity;
	}

	// source → Getter and Setter → 전부 선택하고 Generate
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
