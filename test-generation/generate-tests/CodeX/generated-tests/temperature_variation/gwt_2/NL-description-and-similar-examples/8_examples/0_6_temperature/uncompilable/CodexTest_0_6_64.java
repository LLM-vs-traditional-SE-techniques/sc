import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_64 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull(handler);
    GWT.setUncaughtExceptionHandler(null);
    assertNull(GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(handler);
    assertSame(handler, GWT.getUncaughtExceptionHandler());
  }
}