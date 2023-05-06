import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_13 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull(handler);
    assertSame(handler, GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(null);
    try {
      GWT.getUncaughtExceptionHandler();
      fail("expected NullPointerException");
    } catch (NullPointerException expected) {
    }
    GWT.setUncaughtExceptionHandler(handler);
  }
}