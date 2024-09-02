package com.adiv.newsapp.di;

import android.app.Application;
import com.adiv.newsapp.data.local.NewsDataBase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvidesNewsDatabaseFactory implements Factory<NewsDataBase> {
  private final Provider<Application> applicationProvider;

  public AppModule_ProvidesNewsDatabaseFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public NewsDataBase get() {
    return providesNewsDatabase(applicationProvider.get());
  }

  public static AppModule_ProvidesNewsDatabaseFactory create(
      Provider<Application> applicationProvider) {
    return new AppModule_ProvidesNewsDatabaseFactory(applicationProvider);
  }

  public static NewsDataBase providesNewsDatabase(Application application) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesNewsDatabase(application));
  }
}
