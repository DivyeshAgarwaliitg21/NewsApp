package com.adiv.newsapp.di

import android.app.Application
import androidx.room.Room
import com.adiv.newsapp.Util.Constants.BASE_URL
import com.adiv.newsapp.data.LocalUserManagerImplementation
import com.adiv.newsapp.data.local.NewsDao
import com.adiv.newsapp.data.local.NewsDataBase
import com.adiv.newsapp.data.local.NewsTypeConverter
import com.adiv.newsapp.data.remote.NewsApi
import com.adiv.newsapp.data.repository.NewsRespositoryImplementation
import com.adiv.newsapp.domain.LocalUserManager
import com.adiv.newsapp.domain.repository.NewsRepository
import com.adiv.newsapp.domain.usecases.AppEntryUseCases
import com.adiv.newsapp.domain.usecases.DeleteArticle
import com.adiv.newsapp.domain.usecases.GetNews
import com.adiv.newsapp.domain.usecases.NewsUseCases
import com.adiv.newsapp.domain.usecases.ReadAppEntry
import com.adiv.newsapp.domain.usecases.SaveAppEntry
import com.adiv.newsapp.domain.usecases.SearchNewsUseCases
import com.adiv.newsapp.domain.usecases.SelectArticle
import com.adiv.newsapp.domain.usecases.SelectArticles
import com.adiv.newsapp.domain.usecases.UpsertArticle
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImplementation(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    )= AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

    @Provides
    @Singleton
    fun providesNewsApi(): NewsApi {
        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(
            NewsApi::class.java)
    }



    @Provides
    @Singleton
    fun provideNewsRepository(
        newsApi: NewsApi,
        newsDao: NewsDao
    ): NewsRepository = NewsRespositoryImplementation(newsApi, newsDao)

    @Provides
    @Singleton
    fun provideNewsUseCases(
        newsRepository: NewsRepository,
        newsDao: NewsDao
    ): NewsUseCases {
        return NewsUseCases(
            getNews = GetNews(newsRepository),
            searchNews = SearchNewsUseCases(newsRepository),
            upsertArticle = UpsertArticle(newsRepository),
            deleteArticle = DeleteArticle(newsRepository),
            selectArticles = SelectArticles(newsRepository),
            selectArticle = SelectArticle(newsRepository)
        )
    }

    @Provides
    @Singleton
    fun providesNewsDatabase(
        application: Application
    ): NewsDataBase {
        return Room.databaseBuilder(
            context = application,
            klass = NewsDataBase::class.java,
            name = "news_db"
        ).addTypeConverter(NewsTypeConverter()).fallbackToDestructiveMigration().build()
    }

    @Provides
    @Singleton
    fun provideNewsDao(
        newsDataBase: NewsDataBase
    ): NewsDao = newsDataBase.newsDao


}