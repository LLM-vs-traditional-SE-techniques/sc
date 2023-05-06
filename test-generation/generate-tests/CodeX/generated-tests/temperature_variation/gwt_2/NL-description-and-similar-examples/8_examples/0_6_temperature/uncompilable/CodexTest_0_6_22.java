import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_22 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(null);
      assertNull(GWT.getUncaughtExceptionHandler());
      GWT.setUncaughtExceptionHandler(handler);
      assertEquals(handler, GWT.getUncaughtExceptionHandler());
    } finally {
      GWT.setUncaughtExceptionHandler(handler);
    }
  }
}