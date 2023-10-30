package com.jihee.gameShopBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jihee.gameShopBackEnd.model.Game;


public interface GameShopRepository extends JpaRepository<Game, Long> {

}
