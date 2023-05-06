import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_7 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler def = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEquals("foo", e.getMessage());
      }
    });
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(
          new RuntimeException("foo"));
    } finally {
      GWT.setUncaughtExceptionHandler(def);
    }
  }
}