import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_47 { 
  @Test
  public void testUncaughtExceptionHandlerIsSet() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEquals("java.lang.ArithmeticException: / by zero", e.getMessage());
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(new ArithmeticException("/ by zero"));
  }
}