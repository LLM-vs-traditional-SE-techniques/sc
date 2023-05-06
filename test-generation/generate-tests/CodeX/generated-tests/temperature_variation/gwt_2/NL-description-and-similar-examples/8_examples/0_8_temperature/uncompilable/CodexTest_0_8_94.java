import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_94 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(null);
      fail("Should not be allowed to set the uncaught exception handler to null");
    } catch (NullPointerException ex) {
      // Expected
    }
}