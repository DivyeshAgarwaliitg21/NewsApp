package com.adiv.newsapp.di;

import com.adiv.newsapp.data.local.NewsDao;
import com.adiv.newsapp.data.remote.NewsApi;
import com.adiv.newsapp.domain.repository.NewsRepository;
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
public final class AppModule_ProvideNewsRepositoryFactory implements Factory<NewsRepository> {
  private final Provider<NewsApi> newsApiProvider;

  private final Provider<NewsDao> newsDaoProvider;

  public AppModule_ProvideNewsRepositoryFactory(Provider<NewsApi> newsApiProvider,
      Provider<NewsDao> newsDaoProvider) {
    this.newsApiProvider = newsApiProvider;
    this.newsDaoProvider = newsDaoProvider;
  }

  @Override
  public NewsRepository get() {
    return provideNewsRepository(newsApiProvider.get(), newsDaoProvider.get());
  }

  public static AppModule_ProvideNewsRepositoryFactory create(Provider<NewsApi> newsApiProvider,
      Provider<NewsDao> newsDaoProvider) {
    return new AppModule_ProvideNewsRepositoryFactory(newsApiProvider, newsDaoProvider);
  }

  public static NewsRepository provideNewsRepository(NewsApi newsApi, NewsDao newsDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNewsRepository(newsApi, newsDao));
  }
}
