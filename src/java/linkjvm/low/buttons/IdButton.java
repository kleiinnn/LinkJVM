/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.low.buttons;

public class IdButton extends AbstractTextButton {
  private long swigCPtr;

  protected IdButton(long cPtr, boolean cMemoryOwn) {
    super(linkjvm_buttonsJNI.IdButton_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IdButton obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_buttonsJNI.delete_IdButton(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IdButton(Id id, String defaultText) {
    this(linkjvm_buttonsJNI.new_IdButton(id.swigValue(), defaultText), true);
  }

  public void setText(String text) {
    linkjvm_buttonsJNI.IdButton_setText(swigCPtr, this, text);
  }

  public String text() {
    return linkjvm_buttonsJNI.IdButton_text(swigCPtr, this);
  }

  public boolean isTextDirty() {
    return linkjvm_buttonsJNI.IdButton_isTextDirty(swigCPtr, this);
  }

  public void setPressed(boolean pressed) {
    linkjvm_buttonsJNI.IdButton_setPressed(swigCPtr, this, pressed);
  }

  public boolean value() {
    return linkjvm_buttonsJNI.IdButton_value(swigCPtr, this);
  }

  public void resetText() {
    linkjvm_buttonsJNI.IdButton_resetText(swigCPtr, this);
  }

}
