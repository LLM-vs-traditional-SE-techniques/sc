import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_6 { 
  @Test
  public void testUncaughtExceptionHandler() {
    Thread.UncaughtExceptionHandler oldHandler = Thread.getDefaultUncaughtExceptionHandler();
    Thread.setDefaultUncaughtExceptionHandler(new TestExceptionHandler());
    try {
      throw new RuntimeException("Test");
    } catch (RuntimeException e) {
      // expected
    }
    assertTrue(TestExceptionHandler.exceptionThrown);
    Thread.setDefaultUncaughtExceptionHandler(oldHandler);
  }
}