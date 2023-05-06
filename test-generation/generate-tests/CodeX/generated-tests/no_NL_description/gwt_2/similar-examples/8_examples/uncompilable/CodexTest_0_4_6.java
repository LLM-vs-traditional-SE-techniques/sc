import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_6 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        assertEquals(Thread.currentThread(), t);
        assertEquals(new RuntimeException(), e);
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    try {
      Thread.currentThread().setUncaughtExceptionHandler(handler);
      try {
        throw new RuntimeException();
      } catch (RuntimeException e) {
        // ignore
      }
    } finally {
      // restore the default handler
      Thread.setDefaultUncaughtExceptionHandler(null);
    }
  }
}