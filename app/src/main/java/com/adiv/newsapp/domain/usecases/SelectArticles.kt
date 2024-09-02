package com.adiv.newsapp.domain.usecases

import com.adiv.newsapp.domain.model.Article
import com.adiv.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SelectArticles(
    private val newsRepository: NewsRepository
) {

     operator fun invoke(): Flow<List<Article>>{
        return newsRepository.selectArticles()
    }
}