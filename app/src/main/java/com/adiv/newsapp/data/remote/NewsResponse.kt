package com.adiv.newsapp.data.remote

import com.adiv.newsapp.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)