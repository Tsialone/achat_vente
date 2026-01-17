package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
