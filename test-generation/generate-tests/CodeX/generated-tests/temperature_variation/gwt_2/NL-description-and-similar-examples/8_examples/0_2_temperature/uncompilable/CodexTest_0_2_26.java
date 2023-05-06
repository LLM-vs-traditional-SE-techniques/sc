import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_26 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull(handler);
    try {
      GWT.setUncaughtExceptionHandler(null);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
    }
    GWT.setUncaughtExceptionHandler(handler);
  }
}