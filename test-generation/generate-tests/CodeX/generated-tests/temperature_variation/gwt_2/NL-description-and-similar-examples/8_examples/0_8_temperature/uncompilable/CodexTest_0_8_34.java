import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_34 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final int[] uncaughtExceptions = new int[1];
    final RuntimeException exception = new RuntimeException();
    Thread.currentThread().setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void uncaughtException(Thread t, Throwable e) {
        uncaughtExceptions[0]++;
        assertEquals(exception, e);
      }
    });
    try {
      GWT.getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
    } finally {
      Thread.currentThread().setUncaughtExceptionHandler(null);
    }
    assertEquals(1, uncaughtExceptions[0]);
  }
}