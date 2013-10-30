/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni;

public class Acceleration {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Acceleration(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Acceleration obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_Acceleration(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static short x() {
    return LinkJVMJNI.Acceleration_x();
  }

  public static short y() {
    return LinkJVMJNI.Acceleration_y();
  }

  public static short z() {
    return LinkJVMJNI.Acceleration_z();
  }

  public static boolean calibrate() {
    return LinkJVMJNI.Acceleration_calibrate();
  }

  public Acceleration() {
    this(LinkJVMJNI.new_Acceleration(), true);
  }

}
