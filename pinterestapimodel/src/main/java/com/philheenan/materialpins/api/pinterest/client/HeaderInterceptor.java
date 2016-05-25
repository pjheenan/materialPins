package com.philheenan.materialpins.api.pinterest.client;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;
import javax.inject.Inject;

/**
 * @author Phil Heenan on 30/09/15.
 */
public class HeaderInterceptor implements Interceptor {

  @Inject OkHttpClient client;

  @Override public Response intercept(Chain chain) throws IOException {
    Request original = chain.request().newBuilder().addHeader("", "").build();

    return client.newCall(original).execute();
  }
}
