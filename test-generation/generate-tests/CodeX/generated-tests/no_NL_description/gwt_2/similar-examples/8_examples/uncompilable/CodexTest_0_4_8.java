import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_8 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final AtomicReference<Throwable> exception = new AtomicReference<Throwable>();
    Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        exception.set(e);
      }
    });
    try {
      GWT.create(UncaughtExceptionHandler.class);
      fail("Expected exception");
    } catch (RuntimeException e) {
      assertEquals("Uncaught exception", exception.get().getMessage());
    }
  }
}