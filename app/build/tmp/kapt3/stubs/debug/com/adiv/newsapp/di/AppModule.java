package com.adiv.newsapp.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\b\u0010\u0016\u001a\u00020\u0011H\u0007J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/adiv/newsapp/di/AppModule;", "", "()V", "provideAppEntryUseCases", "Lcom/adiv/newsapp/domain/usecases/AppEntryUseCases;", "localUserManager", "Lcom/adiv/newsapp/domain/LocalUserManager;", "provideLocalUserManager", "application", "Landroid/app/Application;", "provideNewsDao", "Lcom/adiv/newsapp/data/local/NewsDao;", "newsDataBase", "Lcom/adiv/newsapp/data/local/NewsDataBase;", "provideNewsRepository", "Lcom/adiv/newsapp/domain/repository/NewsRepository;", "newsApi", "Lcom/adiv/newsapp/data/remote/NewsApi;", "newsDao", "provideNewsUseCases", "Lcom/adiv/newsapp/domain/usecases/NewsUseCases;", "newsRepository", "providesNewsApi", "providesNewsDatabase", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.adiv.newsapp.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.adiv.newsapp.domain.LocalUserManager provideLocalUserManager(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.adiv.newsapp.domain.usecases.AppEntryUseCases provideAppEntryUseCases(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.domain.LocalUserManager localUserManager) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.adiv.newsapp.data.remote.NewsApi providesNewsApi() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.adiv.newsapp.domain.repository.NewsRepository provideNewsRepository(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.data.remote.NewsApi newsApi, @org.jetbrains.annotations.NotNull
    com.adiv.newsapp.data.local.NewsDao newsDao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.adiv.newsapp.domain.usecases.NewsUseCases provideNewsUseCases(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.domain.repository.NewsRepository newsRepository, @org.jetbrains.annotations.NotNull
    com.adiv.newsapp.data.local.NewsDao newsDao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.adiv.newsapp.data.local.NewsDataBase providesNewsDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.adiv.newsapp.data.local.NewsDao provideNewsDao(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.data.local.NewsDataBase newsDataBase) {
        return null;
    }
}