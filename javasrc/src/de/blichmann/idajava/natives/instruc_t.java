/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class instruc_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public instruc_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(instruc_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_instruc_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    IdaJavaJNI.instruc_t_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return IdaJavaJNI.instruc_t_name_get(swigCPtr, this);
  }

  public void setFeature(long value) {
    IdaJavaJNI.instruc_t_feature_set(swigCPtr, this, value);
  }

  public long getFeature() {
    return IdaJavaJNI.instruc_t_feature_get(swigCPtr, this);
  }

  public instruc_t() {
    this(IdaJavaJNI.new_instruc_t(), true);
  }

}
