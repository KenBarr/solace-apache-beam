// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/org/apache/beam/examples/Test.proto

package com.solace.apache.beam.examples;

public final class TestOuterClass {
  private TestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.solace.apache.beam.examples)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string test = 1;</code>
     */
    boolean hasTest();
    /**
     * <code>required string test = 1;</code>
     */
    java.lang.String getTest();
    /**
     * <code>required string test = 1;</code>
     */
    com.google.protobuf.ByteString
        getTestBytes();
  }
  /**
   * Protobuf type {@code com.solace.apache.beam.examples.Test}
   */
  public  static final class Test extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.solace.apache.beam.examples.Test)
      TestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Test.newBuilder() to construct.
    private Test(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Test() {
      test_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Test(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              test_ = bs;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.solace.apache.beam.examples.TestOuterClass.internal_static_org_apache_beam_examples_Test_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.solace.apache.beam.examples.TestOuterClass.internal_static_org_apache_beam_examples_Test_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.solace.apache.beam.examples.TestOuterClass.Test.class, com.solace.apache.beam.examples.TestOuterClass.Test.Builder.class);
    }

    private int bitField0_;
    public static final int TEST_FIELD_NUMBER = 1;
    private volatile java.lang.Object test_;
    /**
     * <code>required string test = 1;</code>
     */
    public boolean hasTest() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string test = 1;</code>
     */
    public java.lang.String getTest() {
      java.lang.Object ref = test_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          test_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string test = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTestBytes() {
      java.lang.Object ref = test_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        test_ = b;
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

      if (!hasTest()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, test_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, test_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.solace.apache.beam.examples.TestOuterClass.Test)) {
        return super.equals(obj);
      }
      com.solace.apache.beam.examples.TestOuterClass.Test other = (com.solace.apache.beam.examples.TestOuterClass.Test) obj;

      boolean result = true;
      result = result && (hasTest() == other.hasTest());
      if (hasTest()) {
        result = result && getTest()
            .equals(other.getTest());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTest()) {
        hash = (37 * hash) + TEST_FIELD_NUMBER;
        hash = (53 * hash) + getTest().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.solace.apache.beam.examples.TestOuterClass.Test parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.solace.apache.beam.examples.TestOuterClass.Test parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.solace.apache.beam.examples.TestOuterClass.Test parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.solace.apache.beam.examples.TestOuterClass.Test parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.solace.apache.beam.examples.TestOuterClass.Test parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.solace.apache.beam.examples.TestOuterClass.Test parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.solace.apache.beam.examples.TestOuterClass.Test parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.solace.apache.beam.examples.TestOuterClass.Test parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.solace.apache.beam.examples.TestOuterClass.Test parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.solace.apache.beam.examples.TestOuterClass.Test parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.solace.apache.beam.examples.TestOuterClass.Test parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.solace.apache.beam.examples.TestOuterClass.Test parseFrom(
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
    public static Builder newBuilder(com.solace.apache.beam.examples.TestOuterClass.Test prototype) {
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
     * Protobuf type {@code com.solace.apache.beam.examples.Test}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.solace.apache.beam.examples.Test)
        com.solace.apache.beam.examples.TestOuterClass.TestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.solace.apache.beam.examples.TestOuterClass.internal_static_org_apache_beam_examples_Test_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.solace.apache.beam.examples.TestOuterClass.internal_static_org_apache_beam_examples_Test_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.solace.apache.beam.examples.TestOuterClass.Test.class, com.solace.apache.beam.examples.TestOuterClass.Test.Builder.class);
      }

      // Construct using com.solace.apache.beam.examples.TestOuterClass.Test.newBuilder()
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
        test_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.solace.apache.beam.examples.TestOuterClass.internal_static_org_apache_beam_examples_Test_descriptor;
      }

      public com.solace.apache.beam.examples.TestOuterClass.Test getDefaultInstanceForType() {
        return com.solace.apache.beam.examples.TestOuterClass.Test.getDefaultInstance();
      }

      public com.solace.apache.beam.examples.TestOuterClass.Test build() {
        com.solace.apache.beam.examples.TestOuterClass.Test result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.solace.apache.beam.examples.TestOuterClass.Test buildPartial() {
        com.solace.apache.beam.examples.TestOuterClass.Test result = new com.solace.apache.beam.examples.TestOuterClass.Test(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.test_ = test_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.solace.apache.beam.examples.TestOuterClass.Test) {
          return mergeFrom((com.solace.apache.beam.examples.TestOuterClass.Test)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.solace.apache.beam.examples.TestOuterClass.Test other) {
        if (other == com.solace.apache.beam.examples.TestOuterClass.Test.getDefaultInstance()) return this;
        if (other.hasTest()) {
          bitField0_ |= 0x00000001;
          test_ = other.test_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTest()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.solace.apache.beam.examples.TestOuterClass.Test parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.solace.apache.beam.examples.TestOuterClass.Test) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object test_ = "";
      /**
       * <code>required string test = 1;</code>
       */
      public boolean hasTest() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string test = 1;</code>
       */
      public java.lang.String getTest() {
        java.lang.Object ref = test_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            test_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string test = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTestBytes() {
        java.lang.Object ref = test_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          test_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string test = 1;</code>
       */
      public Builder setTest(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        test_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string test = 1;</code>
       */
      public Builder clearTest() {
        bitField0_ = (bitField0_ & ~0x00000001);
        test_ = getDefaultInstance().getTest();
        onChanged();
        return this;
      }
      /**
       * <code>required string test = 1;</code>
       */
      public Builder setTestBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        test_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.solace.apache.beam.examples.Test)
    }

    // @@protoc_insertion_point(class_scope:com.solace.apache.beam.examples.Test)
    private static final com.solace.apache.beam.examples.TestOuterClass.Test DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.solace.apache.beam.examples.TestOuterClass.Test();
    }

    public static com.solace.apache.beam.examples.TestOuterClass.Test getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Test>
        PARSER = new com.google.protobuf.AbstractParser<Test>() {
      public Test parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Test(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Test> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Test> getParserForType() {
      return PARSER;
    }

    public com.solace.apache.beam.examples.TestOuterClass.Test getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_beam_examples_Test_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_beam_examples_Test_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1src/main/java/org/apache/beam/examples" +
      "/Test.proto\022\030com.solace.apache.beam.examples\"\024\n" +
      "\004Test\022\014\n\004test\030\001 \002(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_apache_beam_examples_Test_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_beam_examples_Test_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_beam_examples_Test_descriptor,
        new java.lang.String[] { "Test", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}