package com.adiv.newsapp.data.remote;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ9\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/adiv/newsapp/data/remote/NewsApi;", "", "GetNews", "Lcom/adiv/newsapp/data/remote/NewsResponse;", "page", "", "string", "", "apiKey", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SearchNews", "searchQuery", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NewsApi {
    
    @retrofit2.http.GET(value = "everything")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object GetNews(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "sources")
    @org.jetbrains.annotations.NotNull
    java.lang.String string, @retrofit2.http.Query(value = "apiKey")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.adiv.newsapp.data.remote.NewsResponse> $completion);
    
    @retrofit2.http.GET(value = "everything")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object SearchNews(@retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "sources")
    @org.jetbrains.annotations.NotNull
    java.lang.String string, @retrofit2.http.Query(value = "apiKey")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.adiv.newsapp.data.remote.NewsResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}