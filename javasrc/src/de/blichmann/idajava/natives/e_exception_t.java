/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class e_exception_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public e_exception_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(e_exception_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_e_exception_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCode(long value) {
    IdaJavaJNI.e_exception_t_code_set(swigCPtr, this, value);
  }

  public long getCode() {
    return IdaJavaJNI.e_exception_t_code_get(swigCPtr, this);
  }

  public void setCan_cont(boolean value) {
    IdaJavaJNI.e_exception_t_can_cont_set(swigCPtr, this, value);
  }

  public boolean getCan_cont() {
    return IdaJavaJNI.e_exception_t_can_cont_get(swigCPtr, this);
  }

  public void setEa(long value) {
    IdaJavaJNI.e_exception_t_ea_set(swigCPtr, this, value);
  }

  public long getEa() {
    return IdaJavaJNI.e_exception_t_ea_get(swigCPtr, this);
  }

  public void setInfo(String value) {
    IdaJavaJNI.e_exception_t_info_set(swigCPtr, this, value);
  }

  public String getInfo() {
    return IdaJavaJNI.e_exception_t_info_get(swigCPtr, this);
  }

  public e_exception_t() {
    this(IdaJavaJNI.new_e_exception_t(), true);
  }

}
