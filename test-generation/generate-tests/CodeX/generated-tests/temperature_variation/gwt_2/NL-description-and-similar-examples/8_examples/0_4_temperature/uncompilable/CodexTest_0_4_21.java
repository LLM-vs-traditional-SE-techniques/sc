import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_21 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException("test");
      }
    });
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException("test"));
      fail("Expected exception");
    } catch (RuntimeException e) {
      assertEquals("test", e.getMessage());
    }
  }
}