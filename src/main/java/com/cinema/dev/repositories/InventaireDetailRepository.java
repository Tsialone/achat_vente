package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.InventaireDetail;

public interface InventaireDetailRepository extends JpaRepository<InventaireDetail, Long> {
}
