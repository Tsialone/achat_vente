package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.Caisse;

public interface CaisseRepository extends JpaRepository<Caisse, String> {
}
