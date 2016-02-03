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
// source: google/api/label.proto

package com.google.api;

/**
 * Protobuf type {@code google.api.LabelDescriptor}
 *
 * <pre>
 * A description of a label. For details, see [this document](go/api-label).
 * </pre>
 */
public  final class LabelDescriptor extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.api.LabelDescriptor)
    LabelDescriptorOrBuilder {
  // Use LabelDescriptor.newBuilder() to construct.
  private LabelDescriptor(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LabelDescriptor() {
    key_ = "";
    valueType_ = 0;
    description_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LabelDescriptor(
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
            String s = input.readStringRequireUtf8();

            key_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            valueType_ = rawValue;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            description_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.LabelProto.internal_static_google_api_LabelDescriptor_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.LabelProto.internal_static_google_api_LabelDescriptor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.LabelDescriptor.class, com.google.api.LabelDescriptor.Builder.class);
  }

  /**
   * Protobuf enum {@code google.api.LabelDescriptor.ValueType}
   *
   * <pre>
   * Value types that can be used as label values.
   * </pre>
   */
  public enum ValueType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STRING = 0;</code>
     *
     * <pre>
     * A variable-length string. This is the default.
     * </pre>
     */
    STRING(0, 0),
    /**
     * <code>BOOL = 1;</code>
     *
     * <pre>
     * Boolean; true or false.
     * </pre>
     */
    BOOL(1, 1),
    /**
     * <code>INT64 = 2;</code>
     *
     * <pre>
     * A 64-bit signed integer.
     * </pre>
     */
    INT64(2, 2),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>STRING = 0;</code>
     *
     * <pre>
     * A variable-length string. This is the default.
     * </pre>
     */
    public static final int STRING_VALUE = 0;
    /**
     * <code>BOOL = 1;</code>
     *
     * <pre>
     * Boolean; true or false.
     * </pre>
     */
    public static final int BOOL_VALUE = 1;
    /**
     * <code>INT64 = 2;</code>
     *
     * <pre>
     * A 64-bit signed integer.
     * </pre>
     */
    public static final int INT64_VALUE = 2;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static ValueType valueOf(int value) {
      switch (value) {
        case 0: return STRING;
        case 1: return BOOL;
        case 2: return INT64;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ValueType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ValueType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ValueType>() {
            public ValueType findValueByNumber(int number) {
              return ValueType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.api.LabelDescriptor.getDescriptor().getEnumTypes().get(0);
    }

    private static final ValueType[] VALUES = values();

    public static ValueType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ValueType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.api.LabelDescriptor.ValueType)
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object key_;
  /**
   * <code>optional string key = 1;</code>
   *
   * <pre>
   * The label key. Details are described [here](go/api-label#label_keys).
   * </pre>
   */
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>optional string key = 1;</code>
   *
   * <pre>
   * The label key. Details are described [here](go/api-label#label_keys).
   * </pre>
   */
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_TYPE_FIELD_NUMBER = 2;
  private int valueType_;
  /**
   * <code>optional .google.api.LabelDescriptor.ValueType value_type = 2;</code>
   *
   * <pre>
   * The type of data that can be assigned to the label.
   * </pre>
   */
  public int getValueTypeValue() {
    return valueType_;
  }
  /**
   * <code>optional .google.api.LabelDescriptor.ValueType value_type = 2;</code>
   *
   * <pre>
   * The type of data that can be assigned to the label.
   * </pre>
   */
  public com.google.api.LabelDescriptor.ValueType getValueType() {
    com.google.api.LabelDescriptor.ValueType result = com.google.api.LabelDescriptor.ValueType.valueOf(valueType_);
    return result == null ? com.google.api.LabelDescriptor.ValueType.UNRECOGNIZED : result;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   * <code>optional string description = 3;</code>
   *
   * <pre>
   * A human-readable description for the label.
   * </pre>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>optional string description = 3;</code>
   *
   * <pre>
   * A human-readable description for the label.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, key_);
    }
    if (valueType_ != com.google.api.LabelDescriptor.ValueType.STRING.getNumber()) {
      output.writeEnum(2, valueType_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, description_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, key_);
    }
    if (valueType_ != com.google.api.LabelDescriptor.ValueType.STRING.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, valueType_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, description_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.api.LabelDescriptor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.LabelDescriptor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.LabelDescriptor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.api.LabelDescriptor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.api.LabelDescriptor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.LabelDescriptor prototype) {
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
   * Protobuf type {@code google.api.LabelDescriptor}
   *
   * <pre>
   * A description of a label. For details, see [this document](go/api-label).
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.LabelDescriptor)
      com.google.api.LabelDescriptorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.LabelProto.internal_static_google_api_LabelDescriptor_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.LabelProto.internal_static_google_api_LabelDescriptor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.LabelDescriptor.class, com.google.api.LabelDescriptor.Builder.class);
    }

    // Construct using com.google.api.LabelDescriptor.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      key_ = "";

      valueType_ = 0;

      description_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.LabelProto.internal_static_google_api_LabelDescriptor_descriptor;
    }

    public com.google.api.LabelDescriptor getDefaultInstanceForType() {
      return com.google.api.LabelDescriptor.getDefaultInstance();
    }

    public com.google.api.LabelDescriptor build() {
      com.google.api.LabelDescriptor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.LabelDescriptor buildPartial() {
      com.google.api.LabelDescriptor result = new com.google.api.LabelDescriptor(this);
      result.key_ = key_;
      result.valueType_ = valueType_;
      result.description_ = description_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.LabelDescriptor) {
        return mergeFrom((com.google.api.LabelDescriptor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.LabelDescriptor other) {
      if (other == com.google.api.LabelDescriptor.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      if (other.valueType_ != 0) {
        setValueTypeValue(other.getValueTypeValue());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
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
      com.google.api.LabelDescriptor parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.LabelDescriptor) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     * <code>optional string key = 1;</code>
     *
     * <pre>
     * The label key. Details are described [here](go/api-label#label_keys).
     * </pre>
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string key = 1;</code>
     *
     * <pre>
     * The label key. Details are described [here](go/api-label#label_keys).
     * </pre>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string key = 1;</code>
     *
     * <pre>
     * The label key. Details are described [here](go/api-label#label_keys).
     * </pre>
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string key = 1;</code>
     *
     * <pre>
     * The label key. Details are described [here](go/api-label#label_keys).
     * </pre>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <code>optional string key = 1;</code>
     *
     * <pre>
     * The label key. Details are described [here](go/api-label#label_keys).
     * </pre>
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }

    private int valueType_ = 0;
    /**
     * <code>optional .google.api.LabelDescriptor.ValueType value_type = 2;</code>
     *
     * <pre>
     * The type of data that can be assigned to the label.
     * </pre>
     */
    public int getValueTypeValue() {
      return valueType_;
    }
    /**
     * <code>optional .google.api.LabelDescriptor.ValueType value_type = 2;</code>
     *
     * <pre>
     * The type of data that can be assigned to the label.
     * </pre>
     */
    public Builder setValueTypeValue(int value) {
      valueType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.api.LabelDescriptor.ValueType value_type = 2;</code>
     *
     * <pre>
     * The type of data that can be assigned to the label.
     * </pre>
     */
    public com.google.api.LabelDescriptor.ValueType getValueType() {
      com.google.api.LabelDescriptor.ValueType result = com.google.api.LabelDescriptor.ValueType.valueOf(valueType_);
      return result == null ? com.google.api.LabelDescriptor.ValueType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .google.api.LabelDescriptor.ValueType value_type = 2;</code>
     *
     * <pre>
     * The type of data that can be assigned to the label.
     * </pre>
     */
    public Builder setValueType(com.google.api.LabelDescriptor.ValueType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      valueType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.api.LabelDescriptor.ValueType value_type = 2;</code>
     *
     * <pre>
     * The type of data that can be assigned to the label.
     * </pre>
     */
    public Builder clearValueType() {
      
      valueType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>optional string description = 3;</code>
     *
     * <pre>
     * A human-readable description for the label.
     * </pre>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string description = 3;</code>
     *
     * <pre>
     * A human-readable description for the label.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string description = 3;</code>
     *
     * <pre>
     * A human-readable description for the label.
     * </pre>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string description = 3;</code>
     *
     * <pre>
     * A human-readable description for the label.
     * </pre>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>optional string description = 3;</code>
     *
     * <pre>
     * A human-readable description for the label.
     * </pre>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.api.LabelDescriptor)
  }

  // @@protoc_insertion_point(class_scope:google.api.LabelDescriptor)
  private static final com.google.api.LabelDescriptor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.LabelDescriptor();
  }

  public static com.google.api.LabelDescriptor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelDescriptor>
      PARSER = new com.google.protobuf.AbstractParser<LabelDescriptor>() {
    public LabelDescriptor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new LabelDescriptor(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<LabelDescriptor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelDescriptor> getParserForType() {
    return PARSER;
  }

  public com.google.api.LabelDescriptor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

