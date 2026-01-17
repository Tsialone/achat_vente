package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.ProformaEtat;

public interface ProformaEtatRepository
        extends JpaRepository<ProformaEtat, ProformaEtat.ProformaEtatId> {
}
