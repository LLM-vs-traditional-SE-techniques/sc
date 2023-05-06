import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_2 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        throw new RuntimeException(e);
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    try {
      Thread t = new Thread() {
        @Override
        public void run() {
          throw new RuntimeException("test");
        }
      };
      t.start();
      t.join();
      fail("Should have thrown RuntimeException");
    } catch (RuntimeException e) {
      assertEquals("test", e.getCause().getMessage());
    }
  }
}