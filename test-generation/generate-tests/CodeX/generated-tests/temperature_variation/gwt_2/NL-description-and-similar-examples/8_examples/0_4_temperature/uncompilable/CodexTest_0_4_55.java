import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_55 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler testHandler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException(e);
      }
    };
    GWT.setUncaughtExceptionHandler(testHandler);
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(new Exception());
      fail("Expected exception");
    } catch (RuntimeException e) {
      assertEquals("java.lang.Exception", e.getCause().getClass().getName());
    }
  }
}