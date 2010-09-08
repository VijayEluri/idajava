/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class call_stack_info_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public call_stack_info_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(call_stack_info_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_call_stack_info_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCallea(long value) {
    IdaJavaJNI.call_stack_info_t_callea_set(swigCPtr, this, value);
  }

  public long getCallea() {
    return IdaJavaJNI.call_stack_info_t_callea_get(swigCPtr, this);
  }

  public void setFuncea(long value) {
    IdaJavaJNI.call_stack_info_t_funcea_set(swigCPtr, this, value);
  }

  public long getFuncea() {
    return IdaJavaJNI.call_stack_info_t_funcea_get(swigCPtr, this);
  }

  public void setFp(long value) {
    IdaJavaJNI.call_stack_info_t_fp_set(swigCPtr, this, value);
  }

  public long getFp() {
    return IdaJavaJNI.call_stack_info_t_fp_get(swigCPtr, this);
  }

  public void setFuncok(boolean value) {
    IdaJavaJNI.call_stack_info_t_funcok_set(swigCPtr, this, value);
  }

  public boolean getFuncok() {
    return IdaJavaJNI.call_stack_info_t_funcok_get(swigCPtr, this);
  }

  public boolean __eq__(call_stack_info_t r) {
    return IdaJavaJNI.call_stack_info_t___eq__(swigCPtr, this, call_stack_info_t.getCPtr(r), r);
  }

  public boolean __ne__(call_stack_info_t r) {
    return IdaJavaJNI.call_stack_info_t___ne__(swigCPtr, this, call_stack_info_t.getCPtr(r), r);
  }

  public call_stack_info_t() {
    this(IdaJavaJNI.new_call_stack_info_t(), true);
  }

}
