package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.Dept;

public interface DeptRepository extends JpaRepository<Dept, Long> {
}
