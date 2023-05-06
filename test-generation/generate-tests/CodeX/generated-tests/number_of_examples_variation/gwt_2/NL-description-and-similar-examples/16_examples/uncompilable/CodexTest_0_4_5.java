import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_5 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler != null) {
      // The handler is probably a GWTTestCase$GWTTestCaseUncaughtExceptionHandler
      // or a subclass.
      assertTrue(handler instanceof UncaughtExceptionHandler);
      assertEquals("com.google.gwt.core.Core.JUnit", GWT.getModuleName());
    }
  }
}