package com.adiv.newsapp.data.local;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/adiv/newsapp/data/local/NewsDataBase;", "Landroidx/room/RoomDatabase;", "()V", "newsDao", "Lcom/adiv/newsapp/data/local/NewsDao;", "getNewsDao", "()Lcom/adiv/newsapp/data/local/NewsDao;", "app_debug"})
@androidx.room.Database(entities = {com.adiv.newsapp.domain.model.Article.class}, version = 2)
@androidx.room.TypeConverters(value = {com.adiv.newsapp.data.local.NewsTypeConverter.class})
public abstract class NewsDataBase extends androidx.room.RoomDatabase {
    
    public NewsDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.adiv.newsapp.data.local.NewsDao getNewsDao();
}