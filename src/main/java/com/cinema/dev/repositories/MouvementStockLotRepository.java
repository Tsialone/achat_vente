package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.MouvementStockLot;

public interface MouvementStockLotRepository
        extends JpaRepository<MouvementStockLot, MouvementStockLot.MouvementStockLotId> {
}
