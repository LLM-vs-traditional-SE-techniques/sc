import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_30 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull("GWT.getUncaughtExceptionHandler() must not return null", handler);
    try {
      handler.onUncaughtException(new Exception("test"));
    } catch (RuntimeException e) {
      fail("GWT.getUncaughtExceptionHandler() must not throw any exception");
    }
  }
}