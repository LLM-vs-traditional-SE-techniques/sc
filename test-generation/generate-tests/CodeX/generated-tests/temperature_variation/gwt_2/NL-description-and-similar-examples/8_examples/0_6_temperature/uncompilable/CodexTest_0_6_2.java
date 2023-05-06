import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_2 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(null);
    try {
      GWT.getUncaughtExceptionHandler();
      fail("Exception expected");
    } catch (IllegalStateException expected) {
    }
    GWT.setUncaughtExceptionHandler(handler);
    assertSame(handler, GWT.getUncaughtExceptionHandler());
  }
}