// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/echo.proto

// Protobuf Java Version: 3.25.2
package com.google.showcase.v1beta1;

public interface PagedExpandRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.PagedExpandRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The string to expand.
   * </pre>
   *
   * <code>string content = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * The string to expand.
   * </pre>
   *
   * <code>string content = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * The number of words to returned in each page.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The position of the page to be returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The position of the page to be returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
