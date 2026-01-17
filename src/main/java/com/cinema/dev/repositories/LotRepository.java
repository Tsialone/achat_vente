package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.Lot;

public interface LotRepository extends JpaRepository<Lot, Long> {
}
