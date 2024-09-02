package com.adiv.newsapp

sealed class SearchEvent {

    data class UpdateSearchQuery(val searchQuery: String): SearchEvent()

    object SearchNews: SearchEvent()

}