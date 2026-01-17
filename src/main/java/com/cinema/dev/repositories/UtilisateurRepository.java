package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
