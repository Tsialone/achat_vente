package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
