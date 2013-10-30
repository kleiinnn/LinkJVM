/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni;

public class InputProvider {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected InputProvider(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InputProvider obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_InputProvider(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean open(int number) {
    return LinkJVMJNI.InputProvider_open(swigCPtr, this, number);
  }

  public boolean isOpen() {
    return LinkJVMJNI.InputProvider_isOpen(swigCPtr, this);
  }

  public void setWidth(long width) {
    LinkJVMJNI.InputProvider_setWidth(swigCPtr, this, width);
  }

  public void setHeight(long height) {
    LinkJVMJNI.InputProvider_setHeight(swigCPtr, this, height);
  }

  public boolean next(SWIGTYPE_p_cv__Mat image) {
    return LinkJVMJNI.InputProvider_next(swigCPtr, this, SWIGTYPE_p_cv__Mat.getCPtr(image));
  }

  public boolean close() {
    return LinkJVMJNI.InputProvider_close(swigCPtr, this);
  }

}