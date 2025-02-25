// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/testing.proto

// Protobuf Java Version: 3.25.4
package com.google.showcase.v1beta1;

public interface ListSessionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.ListSessionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The sessions being returned.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Session sessions = 1;</code>
   */
  java.util.List<com.google.showcase.v1beta1.Session> 
      getSessionsList();
  /**
   * <pre>
   * The sessions being returned.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Session sessions = 1;</code>
   */
  com.google.showcase.v1beta1.Session getSessions(int index);
  /**
   * <pre>
   * The sessions being returned.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Session sessions = 1;</code>
   */
  int getSessionsCount();
  /**
   * <pre>
   * The sessions being returned.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Session sessions = 1;</code>
   */
  java.util.List<? extends com.google.showcase.v1beta1.SessionOrBuilder> 
      getSessionsOrBuilderList();
  /**
   * <pre>
   * The sessions being returned.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Session sessions = 1;</code>
   */
  com.google.showcase.v1beta1.SessionOrBuilder getSessionsOrBuilder(
      int index);

  /**
   * <pre>
   * The next page token, if any.
   * An empty value here means the last page has been reached.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The next page token, if any.
   * An empty value here means the last page has been reached.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
