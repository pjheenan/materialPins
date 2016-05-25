package com.philheenan.materialpins.api.pinterest.model.common;

import com.google.gson.annotations.SerializedName;

/**
 * @author Phil Heenan on 28/09/15.
 */
public class PinterestImageDetail {

  @SerializedName("url")
  public String url;
  @SerializedName("width")
  public int width;
  @SerializedName("height")
  public int height;
}
