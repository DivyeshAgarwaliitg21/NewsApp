package com.adiv.newsapp;

import com.adiv.newsapp.domain.usecases.AppEntryUseCases;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<AppEntryUseCases> appEntryUseCasesProvider;

  public MainActivity_MembersInjector(Provider<AppEntryUseCases> appEntryUseCasesProvider) {
    this.appEntryUseCasesProvider = appEntryUseCasesProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<AppEntryUseCases> appEntryUseCasesProvider) {
    return new MainActivity_MembersInjector(appEntryUseCasesProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectAppEntryUseCases(instance, appEntryUseCasesProvider.get());
  }

  @InjectedFieldSignature("com.adiv.newsapp.MainActivity.appEntryUseCases")
  public static void injectAppEntryUseCases(MainActivity instance,
      AppEntryUseCases appEntryUseCases) {
    instance.appEntryUseCases = appEntryUseCases;
  }
}
