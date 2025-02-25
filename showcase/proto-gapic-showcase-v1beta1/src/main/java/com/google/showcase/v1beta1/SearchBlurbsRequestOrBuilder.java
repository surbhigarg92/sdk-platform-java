// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/messaging.proto

// Protobuf Java Version: 3.25.4
package com.google.showcase.v1beta1;

public interface SearchBlurbsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.SearchBlurbsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The query used to search for blurbs containing to words of this string.
   * Only posts that contain an exact match of a queried word will be returned.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * The query used to search for blurbs containing to words of this string.
   * Only posts that contain an exact match of a queried word will be returned.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * The rooms or profiles to search. If unset, `SearchBlurbs` will search all
   * rooms and all profiles.
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The rooms or profiles to search. If unset, `SearchBlurbs` will search all
   * rooms and all profiles.
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of blurbs return. Server may return fewer
   * blurbs than requested. If unspecified, server will pick an appropriate
   * default.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The value of
   * google.showcase.v1beta1.SearchBlurbsResponse.next_page_token
   * returned from the previous call to
   * `google.showcase.v1beta1.Messaging&#92;SearchBlurbs` method.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value of
   * google.showcase.v1beta1.SearchBlurbsResponse.next_page_token
   * returned from the previous call to
   * `google.showcase.v1beta1.Messaging&#92;SearchBlurbs` method.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
