package com.jihee.gameShopBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jihee.gameShopBackEnd.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long>{

}
