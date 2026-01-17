package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.Livraison;

public interface LivraisonRepository extends JpaRepository<Livraison, String> {
}
