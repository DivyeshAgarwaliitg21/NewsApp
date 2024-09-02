package com.adiv.newsapp.domain.usecases

import com.adiv.newsapp.domain.model.Article
import com.adiv.newsapp.domain.repository.NewsRepository

class SelectArticle(
    private val newsRepository: NewsRepository
) {

    suspend operator fun invoke(url: String): Article?{
        return newsRepository.selectArticle(url)
    }
}