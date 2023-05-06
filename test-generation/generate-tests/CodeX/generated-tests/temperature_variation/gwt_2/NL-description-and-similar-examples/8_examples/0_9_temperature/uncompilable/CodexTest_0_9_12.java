import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_12 { 
  @Test
  void testGetUncaughtExceptionHandler() {
    assertNull(GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(mockExceptionHandler);
    assertEquals(mockExceptionHandler, GWT.getUncaughtExceptionHandler());
  }
}