package com.adiv.newsapp.details

import com.adiv.newsapp.domain.model.Article

sealed class DetailsEvent {
    data class UpsertDeleteArticle(val article: Article): DetailsEvent()

    object RemoveSideEffect: DetailsEvent()

}