package com.philheenan.materialpins.api.pinterest.framework;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.philheenan.materialpins.api.pinterest.client.HeaderInterceptor;
import com.philheenan.materialpins.api.pinterest.client.PinterestClient;
import com.philheenan.materialpins.api.pinterest.client.PinterestOAuthClient;
import com.squareup.okhttp.OkHttpClient;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * @author Phil Heenan on 29/09/15.
 */
@Module(
    library = true,
    complete = false)

public class PinterestModule {

  String oauthEndpoint;
  String apiEndpoints;
  String clientId;
  String clientSecret;
  boolean isDebug;

  public PinterestModule(String oauthEndpoint, String apiEndpoint, String clientId,
      String clientSecret, boolean isDebug) {
    this.oauthEndpoint = oauthEndpoint;
    this.apiEndpoints = apiEndpoint;
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.isDebug = isDebug;
  }

  @Provides @Singleton PinterestOAuthClient providesAuthenticationAdapter() {
    Retrofit retrofit =
        new Retrofit.Builder().baseUrl(oauthEndpoint).client(new OkHttpClient()).build();

    return retrofit.create(PinterestOAuthClient.class);
  }

  @Provides @Singleton OkHttpClient provideClient() {
    OkHttpClient client = new OkHttpClient();
    client.interceptors().add(new HeaderInterceptor());
    return client;
  }

  @Provides @Singleton Gson providesGson() {
    return new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        //.registerTypeAdapter(Date.class, new DateDeserialiser())
        .create();
  }

  @Provides @Singleton PinterestClient providesAdapter(Gson gson, OkHttpClient client) {
    return new Retrofit.Builder().baseUrl(apiEndpoints)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(client)
        .build()
        .create(PinterestClient.class);
  }
}
