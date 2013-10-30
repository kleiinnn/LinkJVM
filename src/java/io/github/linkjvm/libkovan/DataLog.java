/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.libkovan;

public class DataLog {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected DataLog(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataLog obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_DataLog(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Category category(SWIGTYPE_p_std__string name) {
    long cPtr = LinkJVMJNI.DataLog_category(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(name));
    return (cPtr == 0) ? null : new Category(cPtr, false);
  }

  public void removeCategory(SWIGTYPE_p_std__string name) {
    LinkJVMJNI.DataLog_removeCategory(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(name));
  }

  public SWIGTYPE_p_std__vectorT_Category_p_t categories() {
    return new SWIGTYPE_p_std__vectorT_Category_p_t(LinkJVMJNI.DataLog_categories(swigCPtr, this), true);
  }

  public boolean write(DataLogWriter writer) {
    return LinkJVMJNI.DataLog_write(swigCPtr, this, DataLogWriter.getCPtr(writer), writer);
  }

  public void clear() {
    LinkJVMJNI.DataLog_clear(swigCPtr, this);
  }

  public DataLog() {
    this(LinkJVMJNI.new_DataLog(), true);
  }

}