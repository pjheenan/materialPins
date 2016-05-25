package com.philheenan.materialpins.api.pinterest.client;

import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * @author Phil Heenan on 29/09/15.
 */
public interface PinterestOAuthClient {

  @GET("oauth") void accessCode(@Query("response_type") String responseType,
      @Query("redirect_uri") String redirectUri, @Query("client_id") String clientId,
      @Query("client_secret") String clientSecret, @Query("scope") String scope,
      @Query("state") String state);

  @POST("oauth/token") void tokenExchange(@Query("grant_type") String grantType,
      @Query("client_id") String clientId, @Query("code") String code);
}
