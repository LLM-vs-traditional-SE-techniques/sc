import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_8 { 
  @Test
  public static void testUncaughtExceptionHandler() {
    final Exception exception = new Exception();
    UncaughtExceptionHandler exceptionHandler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread thread, Throwable throwable) {
        assertSame(exception, throwable);
      }
    };
    UncaughtExceptionHandler oldHandler = Thread.getDefaultUncaughtExceptionHandler();
    try {
      Thread.setDefaultUncaughtExceptionHandler(exceptionHandler);
      throw exception;
    } catch (Exception e) {
      assertSame(exception, e);
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(oldHandler);
    }
  }
}