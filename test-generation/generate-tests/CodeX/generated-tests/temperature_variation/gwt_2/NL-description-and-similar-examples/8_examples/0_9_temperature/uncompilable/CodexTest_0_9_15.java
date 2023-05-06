import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_15 { 
  @Test
  public void testUncaughtExceptionHandlerGet() {
    GWT.setUncaughtExceptionHandler(new TestUncaughtExceptionHandler());
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertTrue(handler instanceof TestUncaughtExceptionHandler);
    assertTrue(GWT.getUncaughtExceptionHandler().equals(handler));
    assertFalse(GWT.getUncaughtExceptionHandler().equals(null));
  }
}