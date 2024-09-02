package com.adiv.newsapp.domain.usecases

import com.adiv.newsapp.domain.model.Article
import com.adiv.newsapp.domain.repository.NewsRepository

class UpsertArticle(
    private val newsRepository: NewsRepository
) {


    suspend operator fun invoke(article: Article){
        newsRepository.upsertArticle(article)
    }
}