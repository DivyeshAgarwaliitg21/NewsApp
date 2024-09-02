package com.adiv.newsapp.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.adiv.newsapp.domain.model.Article
import kotlinx.coroutines.flow.Flow

@Dao
interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article)


    @Delete
    suspend fun delete(article: Article)

    @androidx.room.Query("Select * From Article")
    fun getArticles(): Flow<List<Article>>

    @androidx.room.Query("Select * From Article Where url=:url")
    suspend fun getArticle(url: String): Article?

}