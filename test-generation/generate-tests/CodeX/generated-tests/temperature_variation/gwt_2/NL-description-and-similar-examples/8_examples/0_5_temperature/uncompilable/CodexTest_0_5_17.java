import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_17 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler defaultHandler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException(e);
      }
    });
    try {
      try {
        throw new RuntimeException();
      } catch (RuntimeException e) {
        assertEquals(e, e.getCause());
      }
    } finally {
      GWT.setUncaughtExceptionHandler(defaultHandler);
    }
  }
}