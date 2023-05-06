import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_44 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler defaultHandler = GWT.getUncaughtExceptionHandler();
    assertNotNull(defaultHandler);
    GWT.setUncaughtExceptionHandler(null);
    assertNull(GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(defaultHandler);
    assertEquals(defaultHandler, GWT.getUncaughtExceptionHandler());
  }
}