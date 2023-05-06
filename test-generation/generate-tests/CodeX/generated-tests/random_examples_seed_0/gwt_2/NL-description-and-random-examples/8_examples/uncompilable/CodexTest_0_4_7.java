import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_7 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final AtomicReference<Throwable> uncaughtException = new AtomicReference<Throwable>();
    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        uncaughtException.set(e);
      }
    });
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        throw new RuntimeException("Uncaught exception");
      }
    });
    thread.start();
    try {
      thread.join();
    } catch (InterruptedException e) {
      fail("Interrupted while waiting for thread to finish");
    }
    assertNotNull("Uncaught exception not thrown", uncaughtException.get());
    assertEquals("Uncaught exception message", "Uncaught exception", uncaughtException.get().getMessage());
  }
}