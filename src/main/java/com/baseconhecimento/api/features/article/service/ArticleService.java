package com.baseconhecimento.api.features.article.service;

import com.baseconhecimento.api.features.article.model.Article;
import com.baseconhecimento.api.features.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    public Article getArticleById(UUID id) {
        return articleRepository.findById(id).orElse(null);
    }

    public Article updateArticle(Article article) {
        return articleRepository.save(article);
    }


}
