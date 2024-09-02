package com.adiv.newsapp;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/adiv/newsapp/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "appEntryUseCases", "Lcom/adiv/newsapp/domain/usecases/AppEntryUseCases;", "getAppEntryUseCases", "()Lcom/adiv/newsapp/domain/usecases/AppEntryUseCases;", "setAppEntryUseCases", "(Lcom/adiv/newsapp/domain/usecases/AppEntryUseCases;)V", "viewModel", "Lcom/adiv/newsapp/MainViewModel;", "getViewModel", "()Lcom/adiv/newsapp/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity {
    @javax.inject.Inject
    public com.adiv.newsapp.domain.usecases.AppEntryUseCases appEntryUseCases;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    
    public MainActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.adiv.newsapp.domain.usecases.AppEntryUseCases getAppEntryUseCases() {
        return null;
    }
    
    public final void setAppEntryUseCases(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.domain.usecases.AppEntryUseCases p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.adiv.newsapp.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}