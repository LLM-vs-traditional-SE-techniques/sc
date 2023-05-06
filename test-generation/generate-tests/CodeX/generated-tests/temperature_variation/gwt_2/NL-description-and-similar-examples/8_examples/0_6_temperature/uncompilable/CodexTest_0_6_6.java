import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_6 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    // Test 1: Check that the getter returns what the setter set.
    final UncaughtExceptionHandler testHandler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        fail("This handler should not be called");
      }
    };
    GWT.setUncaughtExceptionHandler(testHandler);
    assertTrue(testHandler == GWT.getUncaughtExceptionHandler());
}