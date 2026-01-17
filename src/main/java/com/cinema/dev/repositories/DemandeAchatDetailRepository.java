package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.DemandeAchatDetail;

public interface DemandeAchatDetailRepository
        extends JpaRepository<DemandeAchatDetail, DemandeAchatDetail.DemandeAchatDetailId> {
}
