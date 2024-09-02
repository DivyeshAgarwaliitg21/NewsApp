package com.adiv.newsapp;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/adiv/newsapp/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "appEntryUseCases", "Lcom/adiv/newsapp/domain/usecases/AppEntryUseCases;", "(Lcom/adiv/newsapp/domain/usecases/AppEntryUseCases;)V", "splashCondition", "Landroidx/compose/runtime/MutableState;", "", "getSplashCondition", "()Landroidx/compose/runtime/MutableState;", "<set-?>", "", "startDestination", "getStartDestination", "()Ljava/lang/String;", "setStartDestination", "(Ljava/lang/String;)V", "startDestination$delegate", "Landroidx/compose/runtime/MutableState;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.adiv.newsapp.domain.usecases.AppEntryUseCases appEntryUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> splashCondition = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState startDestination$delegate = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.adiv.newsapp.domain.usecases.AppEntryUseCases appEntryUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getSplashCondition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStartDestination() {
        return null;
    }
    
    private final void setStartDestination(java.lang.String p0) {
    }
}