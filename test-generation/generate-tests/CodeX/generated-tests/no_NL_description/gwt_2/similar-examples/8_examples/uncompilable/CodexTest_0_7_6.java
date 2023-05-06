import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_6 { 
  @Test
  public void testUncaughtExceptionHandler() throws Exception {
    final RuntimeException exception = new RuntimeException("Foobar");
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread thread, Throwable e) {
        throw exception;
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    try {
      throw new RuntimeException("Barfoo");
    } catch (RuntimeException e) {
      assertSame(exception, e);
    }
    assertSame(handler, Thread.getDefaultUncaughtExceptionHandler());
  }
}