/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public enum dref_t {
  dr_U,
  dr_O,
  dr_W,
  dr_R,
  dr_T,
  dr_I;

  public final int swigValue() {
    return swigValue;
  }

  public static dref_t swigToEnum(int swigValue) {
    dref_t[] swigValues = dref_t.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (dref_t swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + dref_t.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private dref_t() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private dref_t(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private dref_t(dref_t swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

