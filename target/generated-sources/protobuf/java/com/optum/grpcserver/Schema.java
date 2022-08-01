// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.optum.grpcserver;

public final class Schema {
  private Schema() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_optum_grpcserver_Book_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_optum_grpcserver_Book_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_optum_grpcserver_Author_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_optum_grpcserver_Author_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_optum_grpcserver_Cart_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_optum_grpcserver_Cart_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014schema.proto\022\024com.optum.grpcserver\"W\n\004" +
      "Book\022\017\n\007book_id\030\001 \001(\005\022\r\n\005title\030\002 \001(\t\022\r\n\005" +
      "price\030\003 \001(\002\022\r\n\005pages\030\004 \001(\005\022\021\n\tauthor_id\030" +
      "\005 \001(\005\"c\n\006Author\022\021\n\tauthor_id\030\001 \001(\005\022\022\n\nfi" +
      "rst_name\030\002 \001(\t\022\021\n\tlast_name\030\003 \001(\t\022\016\n\006gen" +
      "der\030\004 \001(\t\022\017\n\007book_id\030\005 \001(\005\"$\n\004Cart\022\r\n\005bo" +
      "oks\030\001 \001(\005\022\r\n\005price\030\002 \001(\0052\322\002\n\021BookAuthorS" +
      "ervice\022I\n\tgetAuthor\022\034.com.optum.grpcserv" +
      "er.Author\032\034.com.optum.grpcserver.Author\"" +
      "\000\022P\n\020getBooksByAuthor\022\034.com.optum.grpcse",
      "rver.Author\032\032.com.optum.grpcserver.Book\"" +
      "\0000\001\022N\n\020getExpensiveBook\022\032.com.optum.grpc" +
      "server.Book\032\032.com.optum.grpcserver.Cart\"" +
      "\000(\001\022P\n\020getBooksByGender\022\032.com.optum.grpc" +
      "server.Book\032\032.com.optum.grpcserver.Cart\"" +
      "\000(\0010\001B\002P\001b\006proto3"
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
    internal_static_com_optum_grpcserver_Book_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_optum_grpcserver_Book_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_optum_grpcserver_Book_descriptor,
        new java.lang.String[] { "BookId", "Title", "Price", "Pages", "AuthorId", });
    internal_static_com_optum_grpcserver_Author_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_optum_grpcserver_Author_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_optum_grpcserver_Author_descriptor,
        new java.lang.String[] { "AuthorId", "FirstName", "LastName", "Gender", "BookId", });
    internal_static_com_optum_grpcserver_Cart_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_optum_grpcserver_Cart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_optum_grpcserver_Cart_descriptor,
        new java.lang.String[] { "Books", "Price", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
