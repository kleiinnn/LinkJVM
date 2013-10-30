/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni;

public class CreateState {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CreateState(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CreateState obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_CreateState(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTimestamp(SWIGTYPE_p_timeval value) {
    LinkJVMJNI.CreateState_timestamp_set(swigCPtr, this, SWIGTYPE_p_timeval.getCPtr(value));
  }

  public SWIGTYPE_p_timeval getTimestamp() {
    return new SWIGTYPE_p_timeval(LinkJVMJNI.CreateState_timestamp_get(swigCPtr, this), true);
  }

  public void setDistance(int value) {
    LinkJVMJNI.CreateState_distance_set(swigCPtr, this, value);
  }

  public int getDistance() {
    return LinkJVMJNI.CreateState_distance_get(swigCPtr, this);
  }

  public void setAngle(int value) {
    LinkJVMJNI.CreateState_angle_set(swigCPtr, this, value);
  }

  public int getAngle() {
    return LinkJVMJNI.CreateState_angle_get(swigCPtr, this);
  }

  public void setRadius(short value) {
    LinkJVMJNI.CreateState_radius_set(swigCPtr, this, value);
  }

  public short getRadius() {
    return LinkJVMJNI.CreateState_radius_get(swigCPtr, this);
  }

  public void setRightVelocity(short value) {
    LinkJVMJNI.CreateState_rightVelocity_set(swigCPtr, this, value);
  }

  public short getRightVelocity() {
    return LinkJVMJNI.CreateState_rightVelocity_get(swigCPtr, this);
  }

  public void setLeftVelocity(short value) {
    LinkJVMJNI.CreateState_leftVelocity_set(swigCPtr, this, value);
  }

  public short getLeftVelocity() {
    return LinkJVMJNI.CreateState_leftVelocity_get(swigCPtr, this);
  }

  public CreateState() {
    this(LinkJVMJNI.new_CreateState(), true);
  }

}
