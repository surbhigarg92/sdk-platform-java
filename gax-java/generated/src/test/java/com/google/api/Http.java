/*
 * Copyright 2015, Google Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/http.proto

package com.google.api;

/**
 * Protobuf type {@code google.api.Http}
 *
 * <pre>
 * Defines the HTTP configuration for a service. It contains a list of
 * [HttpRule][google.api.HttpRule], each specifying the mapping of an RPC method
 * to one or more HTTP REST API methods.
 * </pre>
 */
public  final class Http extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.api.Http)
    HttpOrBuilder {
  // Use Http.newBuilder() to construct.
  private Http(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Http() {
    rules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Http(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              rules_ = new java.util.ArrayList<com.google.api.HttpRule>();
              mutable_bitField0_ |= 0x00000001;
            }
            rules_.add(input.readMessage(com.google.api.HttpRule.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        rules_ = java.util.Collections.unmodifiableList(rules_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.HttpProto.internal_static_google_api_Http_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.HttpProto.internal_static_google_api_Http_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.Http.class, com.google.api.Http.Builder.class);
  }

  public static final int RULES_FIELD_NUMBER = 1;
  private java.util.List<com.google.api.HttpRule> rules_;
  /**
   * <code>repeated .google.api.HttpRule rules = 1;</code>
   *
   * <pre>
   * A list of HTTP rules for configuring the HTTP REST API methods.
   * </pre>
   */
  public java.util.List<com.google.api.HttpRule> getRulesList() {
    return rules_;
  }
  /**
   * <code>repeated .google.api.HttpRule rules = 1;</code>
   *
   * <pre>
   * A list of HTTP rules for configuring the HTTP REST API methods.
   * </pre>
   */
  public java.util.List<? extends com.google.api.HttpRuleOrBuilder> 
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   * <code>repeated .google.api.HttpRule rules = 1;</code>
   *
   * <pre>
   * A list of HTTP rules for configuring the HTTP REST API methods.
   * </pre>
   */
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   * <code>repeated .google.api.HttpRule rules = 1;</code>
   *
   * <pre>
   * A list of HTTP rules for configuring the HTTP REST API methods.
   * </pre>
   */
  public com.google.api.HttpRule getRules(int index) {
    return rules_.get(index);
  }
  /**
   * <code>repeated .google.api.HttpRule rules = 1;</code>
   *
   * <pre>
   * A list of HTTP rules for configuring the HTTP REST API methods.
   * </pre>
   */
  public com.google.api.HttpRuleOrBuilder getRulesOrBuilder(
      int index) {
    return rules_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(1, rules_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rules_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.api.Http parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Http parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Http parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Http parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Http parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.api.Http parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.api.Http parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.api.Http parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.api.Http parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.api.Http parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.Http prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.api.Http}
   *
   * <pre>
   * Defines the HTTP configuration for a service. It contains a list of
   * [HttpRule][google.api.HttpRule], each specifying the mapping of an RPC method
   * to one or more HTTP REST API methods.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.Http)
      com.google.api.HttpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.HttpProto.internal_static_google_api_Http_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.HttpProto.internal_static_google_api_Http_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.Http.class, com.google.api.Http.Builder.class);
    }

    // Construct using com.google.api.Http.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getRulesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.HttpProto.internal_static_google_api_Http_descriptor;
    }

    public com.google.api.Http getDefaultInstanceForType() {
      return com.google.api.Http.getDefaultInstance();
    }

    public com.google.api.Http build() {
      com.google.api.Http result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.Http buildPartial() {
      com.google.api.Http result = new com.google.api.Http(this);
      int from_bitField0_ = bitField0_;
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.Http) {
        return mergeFrom((com.google.api.Http)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.Http other) {
      if (other == com.google.api.Http.getDefaultInstance()) return this;
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rulesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRulesFieldBuilder() : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.Http parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.Http) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.api.HttpRule> rules_ =
      java.util.Collections.emptyList();
    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        rules_ = new java.util.ArrayList<com.google.api.HttpRule>(rules_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.api.HttpRule, com.google.api.HttpRule.Builder, com.google.api.HttpRuleOrBuilder> rulesBuilder_;

    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public java.util.List<com.google.api.HttpRule> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public com.google.api.HttpRule getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public Builder setRules(
        int index, com.google.api.HttpRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public Builder setRules(
        int index, com.google.api.HttpRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public Builder addRules(com.google.api.HttpRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public Builder addRules(
        int index, com.google.api.HttpRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public Builder addRules(
        com.google.api.HttpRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public Builder addRules(
        int index, com.google.api.HttpRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.google.api.HttpRule> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public com.google.api.HttpRule.Builder getRulesBuilder(
        int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public com.google.api.HttpRuleOrBuilder getRulesOrBuilder(
        int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);  } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public java.util.List<? extends com.google.api.HttpRuleOrBuilder> 
         getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public com.google.api.HttpRule.Builder addRulesBuilder() {
      return getRulesFieldBuilder().addBuilder(
          com.google.api.HttpRule.getDefaultInstance());
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public com.google.api.HttpRule.Builder addRulesBuilder(
        int index) {
      return getRulesFieldBuilder().addBuilder(
          index, com.google.api.HttpRule.getDefaultInstance());
    }
    /**
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     *
     * <pre>
     * A list of HTTP rules for configuring the HTTP REST API methods.
     * </pre>
     */
    public java.util.List<com.google.api.HttpRule.Builder> 
         getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.api.HttpRule, com.google.api.HttpRule.Builder, com.google.api.HttpRuleOrBuilder> 
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.api.HttpRule, com.google.api.HttpRule.Builder, com.google.api.HttpRuleOrBuilder>(
                rules_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        rules_ = null;
      }
      return rulesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.api.Http)
  }

  // @@protoc_insertion_point(class_scope:google.api.Http)
  private static final com.google.api.Http DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.Http();
  }

  public static com.google.api.Http getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Http>
      PARSER = new com.google.protobuf.AbstractParser<Http>() {
    public Http parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Http(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Http> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Http> getParserForType() {
    return PARSER;
  }

  public com.google.api.Http getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

