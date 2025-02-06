package com.baseconhecimento.api.features.article.controller;

import com.baseconhecimento.api.features.article.dto.ArticleDTO;
import com.baseconhecimento.api.features.article.model.Article;
import com.baseconhecimento.api.features.article.model.Category;
import com.baseconhecimento.api.features.article.repository.ArticleRepository;
import com.baseconhecimento.api.features.article.repository.CategoryRepository;
import com.baseconhecimento.api.features.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articlesService;

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Article> getAllArticles() {
        return articlesService.getAllArticles();
    }

    @PostMapping
    public Article createArticle(@RequestBody ArticleDTO articleDTO) {
        Category category = categoryRepository.findById(articleDTO.categoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        return articlesService.createArticle(Article.builder()
                .title(articleDTO.title())
                .content(articleDTO.content())
                .category(category)
                .build());


    }
}
