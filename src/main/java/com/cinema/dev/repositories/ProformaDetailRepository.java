package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.ProformaDetail;

public interface ProformaDetailRepository
        extends JpaRepository<ProformaDetail, ProformaDetail.ProformaDetailId> {
}
