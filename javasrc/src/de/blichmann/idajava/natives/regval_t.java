/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class regval_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public regval_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(regval_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_regval_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRvtype(int value) {
    IdaJavaJNI.regval_t_rvtype_set(swigCPtr, this, value);
  }

  public int getRvtype() {
    return IdaJavaJNI.regval_t_rvtype_get(swigCPtr, this);
  }

  public void setIval(SWIGTYPE_p_ulonglong value) {
    IdaJavaJNI.regval_t_ival_set(swigCPtr, this, SWIGTYPE_p_ulonglong.getCPtr(value));
  }

  public SWIGTYPE_p_ulonglong getIval() {
    return new SWIGTYPE_p_ulonglong(IdaJavaJNI.regval_t_ival_get(swigCPtr, this), true);
  }

  public void setFval(int[] value) {
    IdaJavaJNI.regval_t_fval_set(swigCPtr, this, value);
  }

  public int[] getFval() {
    return IdaJavaJNI.regval_t_fval_get(swigCPtr, this);
  }

  public regval_t() {
    this(IdaJavaJNI.new_regval_t__SWIG_0(), true);
  }

  public regval_t(regval_t r) {
    this(IdaJavaJNI.new_regval_t__SWIG_1(regval_t.getCPtr(r), r), true);
  }

  public regval_t __assign__(regval_t r) {
    return new regval_t(IdaJavaJNI.regval_t___assign__(swigCPtr, this, regval_t.getCPtr(r), r), false);
  }

  public void clear() {
    IdaJavaJNI.regval_t_clear(swigCPtr, this);
  }

  public boolean __eq__(regval_t r) {
    return IdaJavaJNI.regval_t___eq__(swigCPtr, this, regval_t.getCPtr(r), r);
  }

  public boolean __ne__(regval_t r) {
    return IdaJavaJNI.regval_t___ne__(swigCPtr, this, regval_t.getCPtr(r), r);
  }

  public void _set_int(SWIGTYPE_p_ulonglong x) {
    IdaJavaJNI.regval_t__set_int(swigCPtr, this, SWIGTYPE_p_ulonglong.getCPtr(x));
  }

  public void _set_float(SWIGTYPE_p_unsigned_short x) {
    IdaJavaJNI.regval_t__set_float(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(x));
  }

  public void set_int(SWIGTYPE_p_ulonglong x) {
    IdaJavaJNI.regval_t_set_int(swigCPtr, this, SWIGTYPE_p_ulonglong.getCPtr(x));
  }

  public void set_float(SWIGTYPE_p_unsigned_short x) {
    IdaJavaJNI.regval_t_set_float(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(x));
  }

  public void swap(regval_t r) {
    IdaJavaJNI.regval_t_swap(swigCPtr, this, regval_t.getCPtr(r), r);
  }

  public bytevec_t bytes() {
    return new bytevec_t(IdaJavaJNI.regval_t_bytes__SWIG_0(swigCPtr, this), false);
  }

  public void _set_bytes(SWIGTYPE_p_unsigned_char data, long size) {
    IdaJavaJNI.regval_t__set_bytes__SWIG_0(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), size);
  }

  public void _set_bytes(bytevec_t v) {
    IdaJavaJNI.regval_t__set_bytes__SWIG_1(swigCPtr, this, bytevec_t.getCPtr(v), v);
  }

  public void set_bytes(SWIGTYPE_p_unsigned_char data, long size) {
    IdaJavaJNI.regval_t_set_bytes__SWIG_0(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), size);
  }

  public void set_bytes(bytevec_t v) {
    IdaJavaJNI.regval_t_set_bytes__SWIG_1(swigCPtr, this, bytevec_t.getCPtr(v), v);
  }

  public bytevec_t _set_bytes() {
    return new bytevec_t(IdaJavaJNI.regval_t__set_bytes__SWIG_2(swigCPtr, this), false);
  }

  public bytevec_t set_bytes() {
    return new bytevec_t(IdaJavaJNI.regval_t_set_bytes__SWIG_2(swigCPtr, this), false);
  }

  public SWIGTYPE_p_void get_data() {
    long cPtr = IdaJavaJNI.regval_t_get_data__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public long get_data_size() {
    return IdaJavaJNI.regval_t_get_data_size(swigCPtr, this);
  }

}
