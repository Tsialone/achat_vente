package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.MouvementStock;

public interface MouvementStockRepository extends JpaRepository<MouvementStock, Long> {
}
