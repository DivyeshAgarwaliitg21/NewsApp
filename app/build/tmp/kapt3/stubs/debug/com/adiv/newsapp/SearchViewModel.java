package com.adiv.newsapp;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/adiv/newsapp/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "newsUseCases", "Lcom/adiv/newsapp/domain/usecases/NewsUseCases;", "(Lcom/adiv/newsapp/domain/usecases/NewsUseCases;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/adiv/newsapp/SearchState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "onEvent", "", "event", "Lcom/adiv/newsapp/SearchEvent;", "searchNews", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.adiv.newsapp.domain.usecases.NewsUseCases newsUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.adiv.newsapp.SearchState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.adiv.newsapp.SearchState> state = null;
    
    @javax.inject.Inject
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.domain.usecases.NewsUseCases newsUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.adiv.newsapp.SearchState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.SearchEvent event) {
    }
    
    private final void searchNews() {
    }
}