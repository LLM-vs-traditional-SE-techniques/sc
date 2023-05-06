import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_2 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final AtomicInteger count = new AtomicInteger();
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        count.incrementAndGet();
      }
    };
    UncaughtExceptionHandler oldHandler = Thread.getDefaultUncaughtExceptionHandler();
    try {
      Thread.setDefaultUncaughtExceptionHandler(handler);
      assertSame(handler, Thread.getDefaultUncaughtExceptionHandler());
      Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(
          Thread.currentThread(), new RuntimeException());
      assertEquals(1, count.get());
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(oldHandler);
    }
  }
}