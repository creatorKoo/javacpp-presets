// Targeted by JavaCPP version 1.4.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.MagickCore.*;

public class MagickPlusPlus extends org.bytedeco.javacpp.presets.MagickPlusPlus {
    static { Loader.load(); }

// Parsed from <Magick++/Geometry.h>

// This may look like C code, but it is really -*- C++ -*-
//
// Copyright Bob Friesenhahn, 1999, 2000, 2001, 2002
// Copyright Dirk Lemstra 2014
//
// Geometry Definition
//
// Representation of an ImageMagick geometry specification
// X11 geometry specification plus hints

// #if !defined (Magick_Geometry_header)
// #define Magick_Geometry_header

// #include "Magick++/Include.h"
// #include <string>

  // Compare two Geometry objects regardless of LHS/RHS

  @Namespace("Magick") @NoOffset public static class Geometry extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Geometry(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Geometry(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Geometry position(long position) {
          return (Geometry)super.position(position);
      }
  

    // Default constructor
    public Geometry() { super((Pointer)null); allocate(); }
    private native void allocate();

    // Construct Geometry from specified string
    public Geometry(@Cast("const char*") BytePointer geometry_) { super((Pointer)null); allocate(geometry_); }
    private native void allocate(@Cast("const char*") BytePointer geometry_);
    public Geometry(String geometry_) { super((Pointer)null); allocate(geometry_); }
    private native void allocate(String geometry_);

    // Copy constructor
    public Geometry(@Const @ByRef Geometry geometry_) { super((Pointer)null); allocate(geometry_); }
    private native void allocate(@Const @ByRef Geometry geometry_);

    // Construct Geometry from specified string

    // Construct Geometry from specified dimensions
    public Geometry(@Cast("size_t") long width_,@Cast("size_t") long height_,@Cast("ssize_t") long xOff_/*=0*/,
          @Cast("ssize_t") long yOff_/*=0*/) { super((Pointer)null); allocate(width_, height_, xOff_, yOff_); }
    private native void allocate(@Cast("size_t") long width_,@Cast("size_t") long height_,@Cast("ssize_t") long xOff_/*=0*/,
          @Cast("ssize_t") long yOff_/*=0*/);
    public Geometry(@Cast("size_t") long width_,@Cast("size_t") long height_) { super((Pointer)null); allocate(width_, height_); }
    private native void allocate(@Cast("size_t") long width_,@Cast("size_t") long height_);

    // Destructor

    // Set via geometry string
    public native @Const @ByRef @Name("operator =") Geometry put(@Cast("const char*") BytePointer geometry_);
    public native @Const @ByRef @Name("operator =") Geometry put(String geometry_);

    // Assignment operator
    public native @ByRef @Name("operator =") Geometry put(@Const @ByRef Geometry Geometry_);

    // Set via geometry string

    // Return geometry string
    public native @Name("operator std::string") @StdString BytePointer asBytePointer();

    // Resize without preserving aspect ratio (!)
    public native void aspect(@Cast("bool") boolean aspect_);
    public native @Cast("bool") boolean aspect();

    // Resize the image based on the smallest fitting dimension (^)
    public native void fillArea(@Cast("bool") boolean fillArea_);
    public native @Cast("bool") boolean fillArea();

    // Resize if image is greater than size (>)
    public native void greater(@Cast("bool") boolean greater_);
    public native @Cast("bool") boolean greater();

    // Height
    public native void height(@Cast("size_t") long height_);
    public native @Cast("size_t") long height();

    // Does object contain valid geometry?
    public native void isValid(@Cast("bool") boolean isValid_);
    public native @Cast("bool") boolean isValid();

    // Resize if image is less than size (<)
    public native void less(@Cast("bool") boolean less_);
    public native @Cast("bool") boolean less();

    // Resize using a pixel area count limit (@)
    public native void limitPixels(@Cast("bool") boolean limitPixels_);
    public native @Cast("bool") boolean limitPixels();

    // Width and height are expressed as percentages
    public native void percent(@Cast("bool") boolean percent_);
    public native @Cast("bool") boolean percent();

    // Width
    public native void width(@Cast("size_t") long width_);
    public native @Cast("size_t") long width();

    // X offset from origin
    public native void xOff(@Cast("ssize_t") long xOff_);
    public native @Cast("ssize_t") long xOff();

    // Y offset from origin
    public native void yOff(@Cast("ssize_t") long yOff_);
    public native @Cast("ssize_t") long yOff();

    //
    // Public methods below this point are for Magick++ use only.
    //

    // Construct from RectangleInfo
    public Geometry(@Const @ByRef RectangleInfo rectangle_) { super((Pointer)null); allocate(rectangle_); }
    private native void allocate(@Const @ByRef RectangleInfo rectangle_);

    // Set via RectangleInfo
    public native @Const @ByRef @Name("operator =") Geometry put(@Const @ByRef RectangleInfo rectangle_);

    // Return an ImageMagick RectangleInfo struct
    public native @ByVal @Name("operator MagickCore::RectangleInfo") RectangleInfo asRectangleInfo();
  }

  // Compare two Offset objects

  @Namespace("Magick") @NoOffset public static class Offset extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Offset(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Offset(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Offset position(long position) {
          return (Offset)super.position(position);
      }
  

    // Default constructor
    public Offset() { super((Pointer)null); allocate(); }
    private native void allocate();

    // Construct Offset from specified string
    public Offset(@Cast("const char*") BytePointer offset_) { super((Pointer)null); allocate(offset_); }
    private native void allocate(@Cast("const char*") BytePointer offset_);
    public Offset(String offset_) { super((Pointer)null); allocate(offset_); }
    private native void allocate(String offset_);

    // Copy constructor
    public Offset(@Const @ByRef Offset offset_) { super((Pointer)null); allocate(offset_); }
    private native void allocate(@Const @ByRef Offset offset_);

    // Construct Offset from specified string

    // Construct Offset from specified x and y
    public Offset(@Cast("ssize_t") long x_,@Cast("ssize_t") long y_) { super((Pointer)null); allocate(x_, y_); }
    private native void allocate(@Cast("ssize_t") long x_,@Cast("ssize_t") long y_);

    // Destructor

    // Set via offset string
    public native @Const @ByRef @Name("operator =") Offset put(@Cast("const char*") BytePointer offset_);
    public native @Const @ByRef @Name("operator =") Offset put(String offset_);

    // Assignment operator
    public native @ByRef @Name("operator =") Offset put(@Const @ByRef Offset offset_);

    // Set via offset string

    // X offset from origin
    public native @Cast("ssize_t") long x();

    // Y offset from origin
    public native @Cast("ssize_t") long y();

    //
    // Public methods below this point are for Magick++ use only.
    //

    // Return an ImageMagick OffsetInfo struct
    public native @ByVal @Name("operator MagickCore::OffsetInfo") OffsetInfo asOffsetInfo();
  }

  // Compare two Point objects

  @Namespace("Magick") @NoOffset public static class Point extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Point(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Point(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Point position(long position) {
          return (Point)super.position(position);
      }
  

    // Default constructor
    public Point() { super((Pointer)null); allocate(); }
    private native void allocate();

    // Construct Point from specified string
    public Point(@Cast("const char*") BytePointer point_) { super((Pointer)null); allocate(point_); }
    private native void allocate(@Cast("const char*") BytePointer point_);
    public Point(String point_) { super((Pointer)null); allocate(point_); }
    private native void allocate(String point_);

    // Copy constructor
    public Point(@Const @ByRef Point point_) { super((Pointer)null); allocate(point_); }
    private native void allocate(@Const @ByRef Point point_);

    // Construct Point from specified string

    // Construct Point from specified x and y
    public Point(double x_,double y_) { super((Pointer)null); allocate(x_, y_); }
    private native void allocate(double x_,double y_);

    // Construct Point from specified x y
    public Point(double xy_) { super((Pointer)null); allocate(xy_); }
    private native void allocate(double xy_);

    // Destructor

    // Set via point string
    public native @Const @ByRef @Name("operator =") Point put(@Cast("const char*") BytePointer point_);
    public native @Const @ByRef @Name("operator =") Point put(String point_);

    // Set via double value
    public native @Const @ByRef @Name("operator =") Point put(double xy_);

    // Assignment operator
    public native @ByRef @Name("operator =") Point put(@Const @ByRef Point point_);

    // Set via point string

    // Return point string
    public native @Name("operator std::string") @StdString BytePointer asBytePointer();

    // Does object contain valid point?
    public native @Cast("bool") boolean isValid();

    // X offset from origin
    public native double x();

    // Y offset from origin
    public native double y();
  }
 // namespace Magick

// #endif // Magick_Geometry_header


// Parsed from <Magick++/Blob.h>

// This may look like C code, but it is really -*- C++ -*-
//
// Copyright Bob Friesenhahn, 1999, 2000, 2001, 2002
// Copyright Dirk Lemstra 2015
//
// Reference counted container class for Binary Large Objects (BLOBs)
//

// #if !defined(Magick_BlobRef_header)
// #define Magick_BlobRef_header

// #include "Magick++/Include.h"
// #include <string>
  // Forward decl
  @Namespace("Magick") @Opaque public static class BlobRef extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public BlobRef() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public BlobRef(Pointer p) { super(p); }
  }

  @Namespace("Magick") @NoOffset public static class Blob extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Blob(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Blob(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Blob position(long position) {
          return (Blob)super.position(position);
      }
  

    /** enum Magick::Blob::Allocator */
    public static final int
      MallocAllocator = 0,
      NewAllocator = 1;

    // Default constructor
    public Blob() { super((Pointer)null); allocate(); }
    private native void allocate();

    // Construct object with data, making a copy of the supplied data.
    public Blob(@Const Pointer data_,@Cast("const size_t") long length_) { super((Pointer)null); allocate(data_, length_); }
    private native void allocate(@Const Pointer data_,@Cast("const size_t") long length_);

    // Copy constructor (reference counted)
    public Blob(@Const @ByRef Blob blob_) { super((Pointer)null); allocate(blob_); }
    private native void allocate(@Const @ByRef Blob blob_);

    // Destructor (reference counted)

    // Assignment operator (reference counted)
    public native @ByRef @Name("operator =") Blob put(@Const @ByRef Blob blob_);

    // Update object contents from Base64-encoded string representation.
    public native void base64(@StdString BytePointer base64_);
    public native void base64(@StdString String base64_);
    // Return Base64-encoded string representation.
    public native @StdString BytePointer base64();

    // Obtain pointer to data. The user should never try to modify or
    // free this data since the Blob class manages its own data. The
    // user must be finished with the data before allowing the Blob to
    // be destroyed since the pointer is invalid once the Blob is
    // destroyed.
    public native @Const Pointer data();

    // Obtain data length.
    public native @Cast("size_t") long length();

    // Update object contents, making a copy of the supplied data.
    // Any existing data in the object is deallocated.
    public native void update(@Const Pointer data_,@Cast("const size_t") long length_);

    // Update object contents, using supplied pointer directly (no
    // copy). Any existing data in the object is deallocated.  The user
    // must ensure that the pointer supplied is not deleted or
    // otherwise modified after it has been supplied to this method.
    // Specify allocator_ as "MallocAllocator" if memory is allocated
    // via the C language malloc() function, or "NewAllocator" if
    // memory is allocated via C++ 'new'.
    public native void updateNoCopy(Pointer data_,@Cast("const size_t") long length_,
          @Cast("const Magick::Blob::Allocator") int allocator_/*=Magick::Blob::NewAllocator*/);
    public native void updateNoCopy(Pointer data_,@Cast("const size_t") long length_);
  }

 // namespace Magick

// #endif // Magick_BlobRef_header


}
