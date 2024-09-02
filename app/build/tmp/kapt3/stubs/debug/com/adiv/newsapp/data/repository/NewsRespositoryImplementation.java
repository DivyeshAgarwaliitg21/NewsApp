package com.adiv.newsapp.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J*\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\bH\u0016J\u0019\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/adiv/newsapp/data/repository/NewsRespositoryImplementation;", "Lcom/adiv/newsapp/domain/repository/NewsRepository;", "newsApi", "Lcom/adiv/newsapp/data/remote/NewsApi;", "newsDao", "Lcom/adiv/newsapp/data/local/NewsDao;", "(Lcom/adiv/newsapp/data/remote/NewsApi;Lcom/adiv/newsapp/data/local/NewsDao;)V", "GetNews", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/adiv/newsapp/domain/model/Article;", "sources", "", "", "SearchNews", "searchQuery", "deleteArticle", "", "article", "(Lcom/adiv/newsapp/domain/model/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectArticle", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectArticles", "upsertArticle", "app_debug"})
public final class NewsRespositoryImplementation implements com.adiv.newsapp.domain.repository.NewsRepository {
    @org.jetbrains.annotations.NotNull
    private final com.adiv.newsapp.data.remote.NewsApi newsApi = null;
    @org.jetbrains.annotations.NotNull
    private final com.adiv.newsapp.data.local.NewsDao newsDao = null;
    
    public NewsRespositoryImplementation(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.data.remote.NewsApi newsApi, @org.jetbrains.annotations.NotNull
    com.adiv.newsapp.data.local.NewsDao newsDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.adiv.newsapp.domain.model.Article>> GetNews(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sources) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.adiv.newsapp.domain.model.Article>> SearchNews(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sources) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object upsertArticle(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.domain.model.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteArticle(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.domain.model.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.adiv.newsapp.domain.model.Article>> selectArticles() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object selectArticle(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.adiv.newsapp.domain.model.Article> $completion) {
        return null;
    }
}