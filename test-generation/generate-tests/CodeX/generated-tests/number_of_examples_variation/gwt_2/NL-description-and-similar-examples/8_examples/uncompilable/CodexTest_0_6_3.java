import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_3 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    assertNotNull(ueh);
    try {
      GWT.setUncaughtExceptionHandler(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // Expected
    }
    try {
      GWT.log("Hello");
      fail("Expected RuntimeException");
    } catch (RuntimeException e) {
      // Expected
    }
    GWT.setUncaughtExceptionHandler(ueh);
    GWT.log("Hello");
  }
}