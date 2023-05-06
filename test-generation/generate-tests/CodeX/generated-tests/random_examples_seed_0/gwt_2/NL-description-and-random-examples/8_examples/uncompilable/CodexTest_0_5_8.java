import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_8 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      public void uncaughtException(Thread t, Throwable e) {
        throw new RuntimeException(e);
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    final Exception exception = new Exception();
    try {
      throw exception;
    } catch (Exception e) {
      assertSame(exception, e);
    }
  }
}