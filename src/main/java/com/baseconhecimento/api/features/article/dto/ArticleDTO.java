package com.baseconhecimento.api.features.article.dto;

public record ArticleDTO(
        String title,
        String content,
        Integer categoryId
) {
}
