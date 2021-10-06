// Generated by Dagger (https://dagger.dev).
package com.app.travelbank.api;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvideApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideApiService(retrofitProvider.get());
  }

  public static ApiModule_ProvideApiServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvideApiServiceFactory(retrofitProvider);
  }

  public static ApiService provideApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ApiModule.INSTANCE.provideApiService(retrofit));
  }
}
