package com.jihee.gameShopBackEnd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jihee.gameShopBackEnd.model.Game;
import com.jihee.gameShopBackEnd.model.Purchase;
import com.jihee.gameShopBackEnd.service.GameShopService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins="http://localhost:3000", 
	methods= {RequestMethod.GET, RequestMethod.POST})
public class GameShopController {

	private GameShopService gameShopService;
	
	@Autowired
	public GameShopController(GameShopService gameShopService) {
		super();
		this.gameShopService = gameShopService;
		
}
	
	@Autowired
	public GameShopService getGameShopService() {
		return gameShopService;
	}
	
	@Autowired
	public void setGameShopService(GameShopService gameShopService) {
		this.gameShopService = gameShopService;
	}

	// localhost:8080/products
	// 게임 정보를 새로 생성한다
	@PostMapping()
	public ResponseEntity<Game> saveGame(
			@RequestBody Game game) {
		return new ResponseEntity<Game>(
				gameShopService.saveGame(game),
				HttpStatus.CREATED);
	}
	
	// 전체 게임 정보를 조회한다
	@GetMapping()
	public ResponseEntity<List<Game>> getAllGames() {
		List<Game> games = gameShopService.getAllGames();
		return new ResponseEntity<>(games, HttpStatus.OK);
	}

	// ID로 게임 한 개의 정보를 조회한다
	@GetMapping("{id}")
	public ResponseEntity<Game> getGameById(@PathVariable("id") long id) {
		return new ResponseEntity<Game>(gameShopService.getGameById(id), HttpStatus.OK);
	}

	// ID로 게임 한 개의 정보를 업데이트한다
	@PutMapping("{id}")
	public ResponseEntity<Game> updateGameById(
			@RequestBody Game game, @PathVariable long id) {
		return new ResponseEntity<Game>(gameShopService.updateGameById(game, id),
				HttpStatus.OK);
	}
	
	// ID로 게임 한 개의 정보를 삭제한다
	@DeleteMapping("{id}") //id는 변수이기 때문에 {중괄호} 안에 적어 준다
	public ResponseEntity<String> deleteGame(@PathVariable long id) {
		gameShopService.deleteGameById(id);
		return new ResponseEntity<String>("Game deleted successfully", HttpStatus.OK);
	}

	@PostMapping("purchase")
	public ResponseEntity<Purchase> savePurchase(@RequestBody Purchase purchase) {
		return new ResponseEntity<Purchase>(gameShopService.savePurchase(purchase), HttpStatus.OK);
	}
	
	@PostMapping("purchaselist")
	public ResponseEntity<List<Purchase>> savePurchaseList(@RequestBody List<Purchase> purchaseList) {
		List<Purchase> savedPurchaseList = new ArrayList<Purchase>();
		for (Purchase purchase : purchaseList) {
			savedPurchaseList.add(gameShopService.savePurchase(purchase));
		}
		return new ResponseEntity<List<Purchase>>(savedPurchaseList, HttpStatus.OK);
	}
	
	@GetMapping("purchase")
	public ResponseEntity<List<Purchase>> getAllPurchase() {
		return new ResponseEntity<List<Purchase>>(gameShopService.getAllPurchase(), HttpStatus.OK);
	}
	

}
