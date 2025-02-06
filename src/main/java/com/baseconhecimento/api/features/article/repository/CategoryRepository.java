package com.baseconhecimento.api.features.article.repository;

import com.baseconhecimento.api.features.article.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
