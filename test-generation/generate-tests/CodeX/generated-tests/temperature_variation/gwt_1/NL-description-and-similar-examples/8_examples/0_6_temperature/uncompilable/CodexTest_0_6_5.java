import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_5 { 
  @Test
  public void testIsClient() {
    try {
      double d = seven / zero;
      assertFalse(GWT.isClient());
    } catch (ArithmeticException expected) {
      assertTrue(GWT.isClient());
    }
  }

}