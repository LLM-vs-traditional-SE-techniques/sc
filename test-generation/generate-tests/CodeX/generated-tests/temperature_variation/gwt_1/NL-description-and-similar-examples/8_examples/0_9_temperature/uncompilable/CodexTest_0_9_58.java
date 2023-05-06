import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_58 { 
  @Test
  public void testBooleanIsClient() {
    try {
      double d = seven / zero;
      if (GWT.isClient()) {
        System.out.println("Expected ArithmeticException");
      }
    } catch (ArithmeticException expected) {
      assertTrue(GWT.isClient());
    }
  }
==============================================================================*/
}