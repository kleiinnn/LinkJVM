/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni;

public class BoolSensor {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected BoolSensor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BoolSensor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_BoolSensor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean value() {
    return LinkJVMJNI.BoolSensor_value(swigCPtr, this);
  }

}
