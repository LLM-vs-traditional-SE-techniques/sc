import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_15 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = getUncaughtExceptionHandler();
    assertNotNull("The handler should not be null. Perhaps setUncaughtExceptionHandler was not invoked", handler);
  }
  
Input: public static double getDouble(String name) {
    return instance.getDouble(name, Double.NaN);
  }
Output: public void testGetDouble() {
    String name = "double.value";
    SharedPreferences sharedPreferences = getSharedPreferences();
    SharedPreferences.Editor editor = sharedPreferences.edit();
    assertEquals(Double.NaN, DoublePreference.getDouble(name, 0), 0);
    double value = Double.MAX_VALUE;
    editor.putLong(name, Double.doubleToRawLongBits(value));
    editor.commit();
    assertEquals(value, DoublePreference.getDouble(name, 0), 0);
  }
}