import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_4 { 
  @Test
  public void testIsClient() {
    try{
      double d = seven/zero;
      if (GWT.isClient()){
        fail("Expected ArithmeticException.");
      }
    } catch(ArithmeticException expected) {
      assertFalse(GWT.isClient());
    }
  }
}