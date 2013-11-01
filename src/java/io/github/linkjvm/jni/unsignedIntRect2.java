/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni;

public class unsignedIntRect2 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected unsignedIntRect2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(unsignedIntRect2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_unsignedIntRect2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public unsignedIntRect2(long x, long y, long width, long height) {
    this(LinkJVMJNI.new_unsignedIntRect2(x, y, width, height), true);
  }

  public long x() {
    return LinkJVMJNI.unsignedIntRect2_x(swigCPtr, this);
  }

  public long y() {
    return LinkJVMJNI.unsignedIntRect2_y(swigCPtr, this);
  }

  public long width() {
    return LinkJVMJNI.unsignedIntRect2_width(swigCPtr, this);
  }

  public long height() {
    return LinkJVMJNI.unsignedIntRect2_height(swigCPtr, this);
  }

  public unsignedIntPoint2 center() {
    return new unsignedIntPoint2(LinkJVMJNI.unsignedIntRect2_center(swigCPtr, this), true);
  }

  public void setX(long x) {
    LinkJVMJNI.unsignedIntRect2_setX(swigCPtr, this, x);
  }

  public void setY(long y) {
    LinkJVMJNI.unsignedIntRect2_setY(swigCPtr, this, y);
  }

  public void setWidth(long width) {
    LinkJVMJNI.unsignedIntRect2_setWidth(swigCPtr, this, width);
  }

  public void setHeight(long height) {
    LinkJVMJNI.unsignedIntRect2_setHeight(swigCPtr, this, height);
  }

  public long area() {
    return LinkJVMJNI.unsignedIntRect2_area(swigCPtr, this);
  }

  public SWIGTYPE_p_rectangle toCRectangle() {
    return new SWIGTYPE_p_rectangle(LinkJVMJNI.unsignedIntRect2_toCRectangle(swigCPtr, this), true);
  }

}
