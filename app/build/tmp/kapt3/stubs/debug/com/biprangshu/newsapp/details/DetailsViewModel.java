package com.biprangshu.newsapp.details;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0019\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/biprangshu/newsapp/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "newsUseCases", "Lcom/adiv/newsapp/domain/usecases/NewsUseCases;", "(Lcom/adiv/newsapp/domain/usecases/NewsUseCases;)V", "<set-?>", "", "sideEffect", "getSideEffect", "()Ljava/lang/String;", "setSideEffect", "(Ljava/lang/String;)V", "sideEffect$delegate", "Landroidx/compose/runtime/MutableState;", "deleteArticle", "", "article", "Lcom/adiv/newsapp/domain/model/Article;", "(Lcom/adiv/newsapp/domain/model/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onEvent", "event", "Lcom/adiv/newsapp/details/DetailsEvent;", "upsertArticle", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.adiv.newsapp.domain.usecases.NewsUseCases newsUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState sideEffect$delegate = null;
    
    @javax.inject.Inject
    public DetailsViewModel(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.domain.usecases.NewsUseCases newsUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSideEffect() {
        return null;
    }
    
    private final void setSideEffect(java.lang.String p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.details.DetailsEvent event) {
    }
    
    private final java.lang.Object deleteArticle(com.adiv.newsapp.domain.model.Article article, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object upsertArticle(com.adiv.newsapp.domain.model.Article article, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}