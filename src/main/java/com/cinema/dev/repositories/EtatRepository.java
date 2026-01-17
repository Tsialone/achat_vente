package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.Etat;

public interface EtatRepository extends JpaRepository<Etat, Long> {
}
