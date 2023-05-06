import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_9 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final RuntimeException re = new RuntimeException();
    final boolean[] called = new boolean[] { false };
    final UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        assertSame(re, e);
        assertSame(thread, t);
        called[0] = true;
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    Thread thread = new Thread() {
      @Override
      public void run() {
        throw re;
      }
    };
    thread.start();
    try {
      thread.join(5000);
    } catch (InterruptedException ie) {
      fail("Should not have been interrupted.");
    }
    assertTrue("Did not hit uncaught exception handler", called[0]);
  }
}