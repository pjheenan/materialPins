package com.philheenan.materialpins.api.pinterest;

/**
 * @author Phil Heenan on 28/09/15.
 */
public class PinterestConstants {

  private PinterestConstants() {

  }

  public static final String BASE_URL = "https://api.pinterest.com";

  public static final String API_VERSION = "v1";

  public static final String PATH_BOARDS = "boards";
  public static final String PATH_FOLLOWERS = "followers";
  public static final String PATH_FOLLOWING = "following";
  public static final String PATH_INTERESTS = "interests";
  public static final String PATH_LIKES = "likes";
  public static final String PATH_USER = "me";
  public static final String PATH_PINS = "pins";
  public static final String PATH_SEARCH = "search";

  public static final String QUERY_PARAM_AUTH_TOKEN = "access_token";
  public static final String QUERY_PARAM_FIELDS = "fields";
  public static final String QUERY_PARAM_PAGE_SIZE = "limit";
  public static final String QUERY_PARAM_QUERY = "query";

  public static final String SCOPE_READ_PUBLIC = "read_public";
  public static final String SCOPE_WRITE_PUBLIC = "write_public";
  public static final String SCOPE_READ_RELATIONSHIPS = "read_relationships";
  public static final String SCOPE_WRITE_RELATIONSHIPS = "write_relationships";

  public static final String KEY_COLLABORATORS = "collaborators";
  public static final String KEY_COMMENTS = "comments";
  public static final String KEY_FOLLOWERS = "followers";
  public static final String KEY_FOLLOWING = "following";
  public static final String KEY_LIKES = "likes";
  public static final String KEY_PINS = "pins";
  public static final String KEY_REPINS = "repins";

  public static final String IMAGE_KEY_ORIGINAL = "original";
  public static final String IMAGE_KEY_SMALL = "small";
  public static final String IMAGE_KEY_MEDIUM = "medium";
  public static final String IMAGE_KEY_LARGE = "large";

  public static final String MEDIA_KEY_IMAGE = "image";
  public static final String MEDIA_KEY_VIDEO = "video";

  public static final String HEADER_AUTHORIZATION = "Authorization";
  public static final String HEADER_AUTHORIZATION_PREFIX = "Bearer ";
  public static final String HEADER_RATE_LIMIT = "X-Ratelimit-Limit";
  public static final String HEADER_RATE_LIMIT_REMAINING = "X-Ratelimit-Remaining";

  public static final int ERROR_CODE_RATE_LIMIT_EXCEEDED = 429;
}
