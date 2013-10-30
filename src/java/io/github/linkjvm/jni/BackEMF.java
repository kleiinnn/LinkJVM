/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni;

public class BackEMF extends IntSensor {
  private long swigCPtr;

  protected BackEMF(long cPtr, boolean cMemoryOwn) {
    super(LinkJVMJNI.BackEMF_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BackEMF obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_BackEMF(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BackEMF(short port) {
    this(LinkJVMJNI.new_BackEMF(port), true);
  }

  public int value() {
    return LinkJVMJNI.BackEMF_value(swigCPtr, this);
  }

  public short port() {
    return LinkJVMJNI.BackEMF_port(swigCPtr, this);
  }

}
