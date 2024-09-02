package com.adiv.newsapp.domain.usecases

import androidx.paging.PagingData
import com.adiv.newsapp.domain.model.Article
import com.adiv.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetNews(
    private val newsRepository: NewsRepository
) {

    operator fun invoke(sources: List<String>): Flow<PagingData<Article>>{
        return newsRepository.GetNews(sources)
    }

}