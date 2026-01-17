package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
