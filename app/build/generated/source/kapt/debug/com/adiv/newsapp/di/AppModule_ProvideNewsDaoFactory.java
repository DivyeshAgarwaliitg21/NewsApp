package com.adiv.newsapp.di;

import com.adiv.newsapp.data.local.NewsDao;
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
public final class AppModule_ProvideNewsDaoFactory implements Factory<NewsDao> {
  private final Provider<NewsDataBase> newsDataBaseProvider;

  public AppModule_ProvideNewsDaoFactory(Provider<NewsDataBase> newsDataBaseProvider) {
    this.newsDataBaseProvider = newsDataBaseProvider;
  }

  @Override
  public NewsDao get() {
    return provideNewsDao(newsDataBaseProvider.get());
  }

  public static AppModule_ProvideNewsDaoFactory create(
      Provider<NewsDataBase> newsDataBaseProvider) {
    return new AppModule_ProvideNewsDaoFactory(newsDataBaseProvider);
  }

  public static NewsDao provideNewsDao(NewsDataBase newsDataBase) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNewsDao(newsDataBase));
  }
}
