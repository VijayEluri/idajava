/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class e_breakpoint_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public e_breakpoint_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(e_breakpoint_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_e_breakpoint_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHea(long value) {
    IdaJavaJNI.e_breakpoint_t_hea_set(swigCPtr, this, value);
  }

  public long getHea() {
    return IdaJavaJNI.e_breakpoint_t_hea_get(swigCPtr, this);
  }

  public void setKea(long value) {
    IdaJavaJNI.e_breakpoint_t_kea_set(swigCPtr, this, value);
  }

  public long getKea() {
    return IdaJavaJNI.e_breakpoint_t_kea_get(swigCPtr, this);
  }

  public e_breakpoint_t() {
    this(IdaJavaJNI.new_e_breakpoint_t(), true);
  }

}
