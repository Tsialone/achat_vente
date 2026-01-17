package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
