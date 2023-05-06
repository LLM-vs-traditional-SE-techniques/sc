import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_32 { 
  @Test
  public void testIsClient() {
    try {
      double d = seven / zero;
      if (!GWT.isClient()) {
        System.out.println("seven divided by zero did not throw an exception?  What?");
      }
    } catch (ArithmeticException expected) {
      if (GWT.isClient()) {
        System.out.println("seven divided by zero threw an exception?  What?");
      }
    }
  }

}