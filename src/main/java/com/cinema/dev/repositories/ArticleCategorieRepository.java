package com.cinema.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.dev.models.ArticleCategorie;

public interface ArticleCategorieRepository
        extends JpaRepository<ArticleCategorie, ArticleCategorie.ArticleCategorieId> {
}
