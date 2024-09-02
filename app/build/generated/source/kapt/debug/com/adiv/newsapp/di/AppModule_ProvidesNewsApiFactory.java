package com.adiv.newsapp.di;

import com.adiv.newsapp.data.remote.NewsApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvidesNewsApiFactory implements Factory<NewsApi> {
  @Override
  public NewsApi get() {
    return providesNewsApi();
  }

  public static AppModule_ProvidesNewsApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NewsApi providesNewsApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesNewsApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidesNewsApiFactory INSTANCE = new AppModule_ProvidesNewsApiFactory();
  }
}
