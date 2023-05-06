import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_1 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler originalHandler = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(null);
      assertNull(GWT.getUncaughtExceptionHandler());
      UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
        }
      };
      GWT.setUncaughtExceptionHandler(handler);
      assertEquals(handler, GWT.getUncaughtExceptionHandler());
    } finally {
      GWT.setUncaughtExceptionHandler(originalHandler);
    }
  }
}