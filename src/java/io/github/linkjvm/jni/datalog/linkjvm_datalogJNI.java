/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni.datalog;

public class linkjvm_datalogJNI {
  public final static native void Category_append__SWIG_0(long jarg1, Category jarg1_, String jarg2);
  public final static native void Category_append__SWIG_1(long jarg1, Category jarg1_, double jarg2);
  public final static native void Category_remove(long jarg1, Category jarg1_, long jarg2);
  public final static native long Category_entries(long jarg1, Category jarg1_);
  public final static native String Category_name(long jarg1, Category jarg1_);
  public final static native void delete_Category(long jarg1);
  public final static native void delete_DataLogWriter(long jarg1);
  public final static native boolean DataLogWriter_write(long jarg1, DataLogWriter jarg1_, long jarg2, DataLog jarg2_);
  public final static native long new_CsvWriter(String jarg1);
  public final static native boolean CsvWriter_write(long jarg1, CsvWriter jarg1_, long jarg2, DataLog jarg2_);
  public final static native void delete_CsvWriter(long jarg1);
  public final static native long new_PlainWriter(String jarg1);
  public final static native boolean PlainWriter_write(long jarg1, PlainWriter jarg1_, long jarg2, DataLog jarg2_);
  public final static native void delete_PlainWriter(long jarg1);
  public final static native void delete_DataLog(long jarg1);
  public final static native long DataLog_category(long jarg1, DataLog jarg1_, String jarg2);
  public final static native void DataLog_removeCategory(long jarg1, DataLog jarg1_, String jarg2);
  public final static native long DataLog_categories(long jarg1, DataLog jarg1_);
  public final static native boolean DataLog_write(long jarg1, DataLog jarg1_, long jarg2, DataLogWriter jarg2_);
  public final static native void DataLog_clear(long jarg1, DataLog jarg1_);
  public final static native long new_DataLog();
  public final static native long CsvWriter_SWIGUpcast(long jarg1);
  public final static native long PlainWriter_SWIGUpcast(long jarg1);
}