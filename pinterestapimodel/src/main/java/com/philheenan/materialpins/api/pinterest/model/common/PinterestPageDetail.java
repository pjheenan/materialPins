package com.philheenan.materialpins.api.pinterest.model.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Phil Heenan on 28/09/15.
 */
public class PinterestPageDetail {

  @SerializedName("cursor")
  public String cursor;
  @SerializedName("next")
  public String next;
}
