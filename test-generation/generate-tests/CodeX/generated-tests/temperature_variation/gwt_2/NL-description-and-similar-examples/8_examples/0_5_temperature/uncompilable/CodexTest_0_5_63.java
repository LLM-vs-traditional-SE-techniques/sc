import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_63 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException("This is a test");
      }
    });
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(null);
      fail("Expected RuntimeException");
    } catch (RuntimeException expected) {
      assertEquals("This is a test", expected.getMessage());
    }
  }
}