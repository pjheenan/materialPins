package com.philheenan.materialpins.api.pinterest.client;

import com.philheenan.materialpins.api.pinterest.PinterestConstants;
import java.util.Map;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;
import retrofit.http.QueryMap;

/**
 * @author by Phil Heenan on 29/09/15.
 */
public interface PinterestClient {

  @GET("{PATH}") Call<Object> get(@Path("PATH") String path,
      @Header(PinterestConstants.HEADER_AUTHORIZATION) String authorization,
      @QueryMap Map<String, String> params);

}
