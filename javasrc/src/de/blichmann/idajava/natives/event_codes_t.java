/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public enum event_codes_t {
  set_difbase(1000),
  restore_pushinfo,
  save_pushinfo,
  prolog_analyzed,
  verify_epilog,
  dbgtools_path((verify_epilog) + 2);

  public final int swigValue() {
    return swigValue;
  }

  public static event_codes_t swigToEnum(int swigValue) {
    event_codes_t[] swigValues = event_codes_t.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (event_codes_t swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + event_codes_t.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private event_codes_t() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private event_codes_t(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private event_codes_t(event_codes_t swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

