package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.CommandeEtat;

public interface CommandeEtatRepository
        extends JpaRepository<CommandeEtat, CommandeEtat.CommandeEtatId> {
}
