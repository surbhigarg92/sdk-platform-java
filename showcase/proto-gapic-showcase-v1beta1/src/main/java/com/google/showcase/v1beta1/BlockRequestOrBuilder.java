// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/echo.proto

// Protobuf Java Version: 3.25.4
package com.google.showcase.v1beta1;

public interface BlockRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.BlockRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The amount of time to block before returning a response.
   * </pre>
   *
   * <code>.google.protobuf.Duration response_delay = 1;</code>
   * @return Whether the responseDelay field is set.
   */
  boolean hasResponseDelay();
  /**
   * <pre>
   * The amount of time to block before returning a response.
   * </pre>
   *
   * <code>.google.protobuf.Duration response_delay = 1;</code>
   * @return The responseDelay.
   */
  com.google.protobuf.Duration getResponseDelay();
  /**
   * <pre>
   * The amount of time to block before returning a response.
   * </pre>
   *
   * <code>.google.protobuf.Duration response_delay = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getResponseDelayOrBuilder();

  /**
   * <pre>
   * The error that will be returned by the server. If this code is specified
   * to be the OK rpc code, an empty response will be returned.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * The error that will be returned by the server. If this code is specified
   * to be the OK rpc code, an empty response will be returned.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * The error that will be returned by the server. If this code is specified
   * to be the OK rpc code, an empty response will be returned.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * The response to be returned that will signify successful method call.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.BlockResponse success = 3;</code>
   * @return Whether the success field is set.
   */
  boolean hasSuccess();
  /**
   * <pre>
   * The response to be returned that will signify successful method call.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.BlockResponse success = 3;</code>
   * @return The success.
   */
  com.google.showcase.v1beta1.BlockResponse getSuccess();
  /**
   * <pre>
   * The response to be returned that will signify successful method call.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.BlockResponse success = 3;</code>
   */
  com.google.showcase.v1beta1.BlockResponseOrBuilder getSuccessOrBuilder();

  com.google.showcase.v1beta1.BlockRequest.ResponseCase getResponseCase();
}
