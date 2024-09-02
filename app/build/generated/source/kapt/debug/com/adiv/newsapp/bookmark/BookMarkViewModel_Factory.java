package com.adiv.newsapp.bookmark;

import com.adiv.newsapp.domain.usecases.NewsUseCases;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class BookMarkViewModel_Factory implements Factory<BookMarkViewModel> {
  private final Provider<NewsUseCases> newsUseCasesProvider;

  public BookMarkViewModel_Factory(Provider<NewsUseCases> newsUseCasesProvider) {
    this.newsUseCasesProvider = newsUseCasesProvider;
  }

  @Override
  public BookMarkViewModel get() {
    return newInstance(newsUseCasesProvider.get());
  }

  public static BookMarkViewModel_Factory create(Provider<NewsUseCases> newsUseCasesProvider) {
    return new BookMarkViewModel_Factory(newsUseCasesProvider);
  }

  public static BookMarkViewModel newInstance(NewsUseCases newsUseCases) {
    return new BookMarkViewModel(newsUseCases);
  }
}
