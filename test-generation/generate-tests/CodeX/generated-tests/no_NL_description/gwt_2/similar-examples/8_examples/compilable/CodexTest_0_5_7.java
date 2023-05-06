import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_7 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final RuntimeException expected = new RuntimeException();
    Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        assertSame(expected, e);
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    try {
      Thread.currentThread().setUncaughtExceptionHandler(handler);
      throw expected;
    } catch (Throwable e) {
      assertSame(expected, e);
    }
  }
}