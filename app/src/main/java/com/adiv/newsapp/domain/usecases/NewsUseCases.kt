package com.adiv.newsapp.domain.usecases

data class NewsUseCases(
    val getNews: GetNews,
    val searchNews: SearchNewsUseCases,
    val upsertArticle: UpsertArticle,
    val deleteArticle: DeleteArticle,
    val selectArticles: SelectArticles,
    val selectArticle: SelectArticle
)
