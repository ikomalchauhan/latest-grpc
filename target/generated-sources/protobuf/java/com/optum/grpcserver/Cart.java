// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.optum.grpcserver;

/**
 * Protobuf type {@code com.optum.grpcserver.Cart}
 */
public  final class Cart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.optum.grpcserver.Cart)
    CartOrBuilder {
  // Use Cart.newBuilder() to construct.
  private Cart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Cart() {
    books_ = 0;
    price_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Cart(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
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
          case 8: {

            books_ = input.readInt32();
            break;
          }
          case 16: {

            price_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.optum.grpcserver.Schema.internal_static_com_optum_grpcserver_Cart_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.optum.grpcserver.Schema.internal_static_com_optum_grpcserver_Cart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.optum.grpcserver.Cart.class, com.optum.grpcserver.Cart.Builder.class);
  }

  public static final int BOOKS_FIELD_NUMBER = 1;
  private int books_;
  /**
   * <code>int32 books = 1;</code>
   */
  public int getBooks() {
    return books_;
  }

  public static final int PRICE_FIELD_NUMBER = 2;
  private int price_;
  /**
   * <code>int32 price = 2;</code>
   */
  public int getPrice() {
    return price_;
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
    if (books_ != 0) {
      output.writeInt32(1, books_);
    }
    if (price_ != 0) {
      output.writeInt32(2, price_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (books_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, books_);
    }
    if (price_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, price_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.optum.grpcserver.Cart)) {
      return super.equals(obj);
    }
    com.optum.grpcserver.Cart other = (com.optum.grpcserver.Cart) obj;

    boolean result = true;
    result = result && (getBooks()
        == other.getBooks());
    result = result && (getPrice()
        == other.getPrice());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BOOKS_FIELD_NUMBER;
    hash = (53 * hash) + getBooks();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPrice();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.optum.grpcserver.Cart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.optum.grpcserver.Cart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.optum.grpcserver.Cart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.optum.grpcserver.Cart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.optum.grpcserver.Cart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.optum.grpcserver.Cart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.optum.grpcserver.Cart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.optum.grpcserver.Cart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.optum.grpcserver.Cart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.optum.grpcserver.Cart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.optum.grpcserver.Cart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.optum.grpcserver.Cart parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.optum.grpcserver.Cart prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.optum.grpcserver.Cart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.optum.grpcserver.Cart)
      com.optum.grpcserver.CartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.optum.grpcserver.Schema.internal_static_com_optum_grpcserver_Cart_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.optum.grpcserver.Schema.internal_static_com_optum_grpcserver_Cart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.optum.grpcserver.Cart.class, com.optum.grpcserver.Cart.Builder.class);
    }

    // Construct using com.optum.grpcserver.Cart.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      books_ = 0;

      price_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.optum.grpcserver.Schema.internal_static_com_optum_grpcserver_Cart_descriptor;
    }

    public com.optum.grpcserver.Cart getDefaultInstanceForType() {
      return com.optum.grpcserver.Cart.getDefaultInstance();
    }

    public com.optum.grpcserver.Cart build() {
      com.optum.grpcserver.Cart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.optum.grpcserver.Cart buildPartial() {
      com.optum.grpcserver.Cart result = new com.optum.grpcserver.Cart(this);
      result.books_ = books_;
      result.price_ = price_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.optum.grpcserver.Cart) {
        return mergeFrom((com.optum.grpcserver.Cart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.optum.grpcserver.Cart other) {
      if (other == com.optum.grpcserver.Cart.getDefaultInstance()) return this;
      if (other.getBooks() != 0) {
        setBooks(other.getBooks());
      }
      if (other.getPrice() != 0) {
        setPrice(other.getPrice());
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
      com.optum.grpcserver.Cart parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.optum.grpcserver.Cart) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int books_ ;
    /**
     * <code>int32 books = 1;</code>
     */
    public int getBooks() {
      return books_;
    }
    /**
     * <code>int32 books = 1;</code>
     */
    public Builder setBooks(int value) {
      
      books_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 books = 1;</code>
     */
    public Builder clearBooks() {
      
      books_ = 0;
      onChanged();
      return this;
    }

    private int price_ ;
    /**
     * <code>int32 price = 2;</code>
     */
    public int getPrice() {
      return price_;
    }
    /**
     * <code>int32 price = 2;</code>
     */
    public Builder setPrice(int value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 price = 2;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.optum.grpcserver.Cart)
  }

  // @@protoc_insertion_point(class_scope:com.optum.grpcserver.Cart)
  private static final com.optum.grpcserver.Cart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.optum.grpcserver.Cart();
  }

  public static com.optum.grpcserver.Cart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Cart>
      PARSER = new com.google.protobuf.AbstractParser<Cart>() {
    public Cart parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Cart(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Cart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Cart> getParserForType() {
    return PARSER;
  }

  public com.optum.grpcserver.Cart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

