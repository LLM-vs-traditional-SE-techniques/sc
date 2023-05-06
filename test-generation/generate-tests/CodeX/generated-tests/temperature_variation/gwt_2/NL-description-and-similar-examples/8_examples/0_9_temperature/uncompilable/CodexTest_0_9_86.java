import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_86 { 
  @Test
  public void testSetUncaughtExceptionHandler() {
    final RuntimeException exception = new RuntimeException("Expected!");
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertTrue("Exception should be of type RuntimeException", e instanceof RuntimeException);
        assertSame("Exception should be the one we injected", exception, e);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(exception);
  }
}