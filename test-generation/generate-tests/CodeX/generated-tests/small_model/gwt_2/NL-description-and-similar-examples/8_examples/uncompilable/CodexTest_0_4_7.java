import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_7 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull("UncaughtExceptionHandler is null", handler);
    assertTrue("UncaughtExceptionHandler is not an instance of com.google.gwt.core.UncaughtExceptionHandler",
        handler instanceof com.google.gwt.core.UncaughtExceptionHandler);
  }
}