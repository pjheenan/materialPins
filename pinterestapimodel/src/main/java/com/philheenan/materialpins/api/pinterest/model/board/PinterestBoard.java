package com.philheenan.materialpins.api.pinterest.model.board;

import com.google.gson.annotations.SerializedName;
import com.philheenan.materialpins.api.pinterest.model.common.PinterestImageDetail;
import com.philheenan.materialpins.api.pinterest.model.user.PinterestUser;
import java.util.HashMap;

/**
 * @author Phil Heenan on 28/09/15.
 */
public class PinterestBoard {

  @SerializedName("id")
  public String id;
  @SerializedName("name")
  public String name;
  @SerializedName("url")
  public String url;
  @SerializedName("description")
  public String description;
  @SerializedName("creator")
  public PinterestUser creator;
  @SerializedName("created_at")
  public String createdAt;
  @SerializedName("counts")
  public HashMap<String, Integer> counts;
  @SerializedName("image")
  public HashMap<String, PinterestImageDetail> image;

}
