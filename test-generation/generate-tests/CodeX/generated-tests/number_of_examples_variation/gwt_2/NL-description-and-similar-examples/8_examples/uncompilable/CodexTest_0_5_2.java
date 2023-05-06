import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_2 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWTTestCase.setUncaughtExceptionHandler(null);
    assertNull(GWTTestCase.getUncaughtExceptionHandler());
    GWTTestCase.setUncaughtExceptionHandler(GWTTestCase.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER);
    assertSame(GWTTestCase.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER,
        GWTTestCase.getUncaughtExceptionHandler());
  }
}