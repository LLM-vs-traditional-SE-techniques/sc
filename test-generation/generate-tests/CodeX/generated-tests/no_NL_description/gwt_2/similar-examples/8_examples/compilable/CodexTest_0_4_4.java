import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_4 { 
  @Test
  public void testUncaughtExceptionHandler() throws Exception {
    Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        assertEquals(Thread.currentThread(), t);
        assertEquals(RuntimeException.class, e.getClass());
        assertEquals("foo", e.getMessage());
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    Thread.currentThread().setUncaughtExceptionHandler(handler);
    Thread.UncaughtExceptionHandler defaultHandler =
        Thread.getDefaultUncaughtExceptionHandler();
    assertSame(handler, defaultHandler);
    Thread.UncaughtExceptionHandler threadHandler =
        Thread.currentThread().getUncaughtExceptionHandler();
    assertSame(handler, threadHandler);
    throw new RuntimeException("foo");
  }
}