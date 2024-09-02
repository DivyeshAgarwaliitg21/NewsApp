package com.adiv.newsapp.bookmark

import com.adiv.newsapp.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)
