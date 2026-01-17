package com.cinema.dev.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.dev.models.Article;
import com.cinema.dev.repositories.ArticleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}
