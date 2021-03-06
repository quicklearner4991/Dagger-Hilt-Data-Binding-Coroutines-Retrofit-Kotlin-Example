// Generated by Dagger (https://dagger.dev).
package com.app.travelbank.api;

import com.app.travelbank.repository.Repository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvidesRepositoryFactory implements Factory<Repository> {
  private final Provider<ApiService> apiServiceProvider;

  public ApiModule_ProvidesRepositoryFactory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public Repository get() {
    return providesRepository(apiServiceProvider.get());
  }

  public static ApiModule_ProvidesRepositoryFactory create(
      Provider<ApiService> apiServiceProvider) {
    return new ApiModule_ProvidesRepositoryFactory(apiServiceProvider);
  }

  public static Repository providesRepository(ApiService apiService) {
    return Preconditions.checkNotNullFromProvides(ApiModule.INSTANCE.providesRepository(apiService));
  }
}
