import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_33 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    if (ueh == null) {
      assertEquals(0, threadWithUncaughtExceptionHandler.getUncaughtExceptions().size());
      throw new RuntimeException("This exception should not be caught");
    } else {
      ueh.onUncaughtException(threadWithUncaughtExceptionHandler, new RuntimeException(
          "This exception should be caught"));
      assertEquals(1, threadWithUncaughtExceptionHandler.getUncaughtExceptions().size());
      assertEquals("This exception should be caught", threadWithUncaughtExceptionHandler
          .getUncaughtExceptions().get(0).getMessage());
    }
  }
}