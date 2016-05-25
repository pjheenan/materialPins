package com.philheenan.materialpins.api.pinterest.model.pin;

import com.google.gson.annotations.SerializedName;
import com.philheenan.materialpins.api.pinterest.model.board.PinterestBoard;
import com.philheenan.materialpins.api.pinterest.model.common.PinterestImageDetail;
import com.philheenan.materialpins.api.pinterest.model.user.PinterestUser;
import java.util.HashMap;

/**
 * @author Phil Heenan on 28/09/15.
 */
public class PinterestPin {

  @SerializedName("id")
  public String id;
  @SerializedName("link")
  public String link;
  @SerializedName("user")
  public PinterestUser user;
  @SerializedName("board")
  public PinterestBoard board;
  @SerializedName("created_at")
  public String createdAt;
  @SerializedName("note")
  public String note;
  @SerializedName("color")
  public String color;
  @SerializedName("counts")
  public HashMap<String, Integer> counts;
  @SerializedName("media")
  public HashMap<String, String> media;
  @SerializedName("attribution")
  public HashMap<String, String> attribution;
  @SerializedName("image")
  public HashMap<String, PinterestImageDetail> image;
  @SerializedName("metadata")
  public HashMap<String, Object> metadata;
}
