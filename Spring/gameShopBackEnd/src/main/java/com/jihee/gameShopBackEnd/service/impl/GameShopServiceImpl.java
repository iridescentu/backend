package com.jihee.gameShopBackEnd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jihee.gameShopBackEnd.exception.ResourceNotFoundException;
import com.jihee.gameShopBackEnd.model.Game;
import com.jihee.gameShopBackEnd.repository.GameShopRepository;
import com.jihee.gameShopBackEnd.service.GameShopService;

@Service
public class GameShopServiceImpl implements GameShopService {

	private GameShopRepository gameShopRepository;
	
	@Autowired
	public GameShopServiceImpl(GameShopRepository gameShopRepository) {
		super();
		this.gameShopRepository = gameShopRepository;
	}
	
	// 게임 정보를 새로 생성한다
	@Override
	public Game saveGame(Game game) {
		System.out.println(game.getId());
		System.out.println(game.getTitle());
		System.out.println(game.getGenre());
		System.out.println(game.getPrice());
		System.out.println(game.getImage());
		System.out.println(game.getText());
		return gameShopRepository.save(game);
}
	
	// 전체 게임 정보를 조회한다
	@Override
	public List<Game> getAllGames() {
		return gameShopRepository.findAll();
	}

	// ID로 게임 한 개의 정보를 조회한다
	@Override
	public Game getGameById(long id) {
		return gameShopRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Game", "id", id));
	}

	// ID로 게임 한 개의 정보를 업데이트한다
	@Override
	public Game updateGameById(Game game, long id) {
		Game existingGame = gameShopRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Game", "id", id));
		existingGame.setId(game.getId());
		existingGame.setTitle(game.getTitle());
		existingGame.setGenre(game.getGenre());
		existingGame.setPrice(game.getPrice());
		existingGame.setImage(game.getImage());
		existingGame.setText(game.getText());
		
		gameShopRepository.save(existingGame);
		return null;
		
	}

	// ID로 게임 한 개의 정보를 삭제한다
	@Override
	public void deleteGameById(long id) {
		gameShopRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Game", "id", id));
		gameShopRepository.deleteById(id);
	}

	
}




