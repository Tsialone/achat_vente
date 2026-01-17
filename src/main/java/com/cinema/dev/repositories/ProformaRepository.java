package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.Proforma;

public interface ProformaRepository extends JpaRepository<Proforma, Long> {
}
