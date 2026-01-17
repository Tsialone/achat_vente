package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.DemandeAchat;

public interface DemandeAchatRepository extends JpaRepository<DemandeAchat, Long> {
}
