// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

public interface SubmitConfigSourceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.SubmitConfigSourceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The generated service configuration.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 1;</code>
   */
  boolean hasServiceConfig();
  /**
   * <pre>
   * The generated service configuration.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 1;</code>
   */
  com.google.api.Service getServiceConfig();
  /**
   * <pre>
   * The generated service configuration.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 1;</code>
   */
  com.google.api.ServiceOrBuilder getServiceConfigOrBuilder();
}
