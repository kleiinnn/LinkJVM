/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni;

public class unsignedIntPoint2 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected unsignedIntPoint2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(unsignedIntPoint2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_unsignedIntPoint2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public unsignedIntPoint2(long x, long y) {
    this(LinkJVMJNI.new_unsignedIntPoint2(x, y), true);
  }

  public long x() {
    return LinkJVMJNI.unsignedIntPoint2_x(swigCPtr, this);
  }

  public long y() {
    return LinkJVMJNI.unsignedIntPoint2_y(swigCPtr, this);
  }

  public void setX(long x) {
    LinkJVMJNI.unsignedIntPoint2_setX(swigCPtr, this, x);
  }

  public void setY(long y) {
    LinkJVMJNI.unsignedIntPoint2_setY(swigCPtr, this, y);
  }

  public SWIGTYPE_p_point2 toCPoint2() {
    return new SWIGTYPE_p_point2(LinkJVMJNI.unsignedIntPoint2_toCPoint2(swigCPtr, this), true);
  }

}
