import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_59 { 
  @Test
  public void testUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(exceptionHandler);
    assertEquals(exceptionHandler, GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(null);
    assertEquals(null, GWT.getUncaughtExceptionHandler());
  }
  
Input: public static double getDouble(Object o, int field) {
    return UNSAFE.getDouble(o, field);
  }
Output: public void testGetObject() {
    assertEquals(42, UNSAFE.getDouble(one, 42));
  }
}