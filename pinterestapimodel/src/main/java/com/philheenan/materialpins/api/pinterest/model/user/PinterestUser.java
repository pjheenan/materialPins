package com.philheenan.materialpins.api.pinterest.model.user;

import com.google.gson.annotations.SerializedName;
import com.philheenan.materialpins.api.pinterest.model.common.PinterestImageDetail;
import java.util.HashMap;

/**
 * @author Phil Heenan on 28/09/15.
 */
public class PinterestUser {

  @SerializedName("id")
  public String id;
  @SerializedName("username")
  public String username;
  @SerializedName("first_name")
  public String firstName;
  @SerializedName("last_name")
  public String lastName;
  @SerializedName("bio")
  public String bio;
  @SerializedName("created_at")
  public String createdAt;
  @SerializedName("counts")
  public HashMap<String, Integer> counts;
  @SerializedName("image")
  public HashMap<String, PinterestImageDetail> image;
}
