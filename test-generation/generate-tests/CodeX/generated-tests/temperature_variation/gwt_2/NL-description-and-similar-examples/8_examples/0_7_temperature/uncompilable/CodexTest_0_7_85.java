import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_85 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    try {
      GWTTestCase.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
          assertTrue(e instanceof NullPointerException);
        }
      });
      GWTTestCase.throwNpe();
      fail("Expected exception to be thrown");
    } finally {
      GWTTestCase.setUncaughtExceptionHandler(GWTTestCase.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER);
    }
  }
}