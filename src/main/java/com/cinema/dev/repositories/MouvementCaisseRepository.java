package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.MouvementCaisse;

public interface MouvementCaisseRepository extends JpaRepository<MouvementCaisse, Long> {
}
