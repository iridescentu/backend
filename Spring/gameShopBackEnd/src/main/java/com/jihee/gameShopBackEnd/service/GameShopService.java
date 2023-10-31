package com.jihee.gameShopBackEnd.service;

import java.util.List;

import com.jihee.gameShopBackEnd.model.Game;
import com.jihee.gameShopBackEnd.model.Purchase;

public interface GameShopService {

	// 게임 정보를 저장
	Game saveGame(Game game);
	
	// 전체 게임 정보 조회
	List<Game> getAllGames();
	
	// ID로 게임 한 개의 정보 조회
	Game getGameById(long id);
	
	// ID로 게임 한 개의 정보를 업데이트
	Game updateGameById(Game game, long id); // 업데이트를 하기 위해서는 game도 받아야 하기 때문에 game과 id를 받음
	
	// ID로 게임 한 개의 정보를 삭제
	void deleteGameById(long id);
	
	// 구매 예정 목록을 저장
	Purchase savePurchase(Purchase purchase);
	
	// 구매 예정 목록을 전부 불러오기
	List<Purchase> getAllPurchase();
}
