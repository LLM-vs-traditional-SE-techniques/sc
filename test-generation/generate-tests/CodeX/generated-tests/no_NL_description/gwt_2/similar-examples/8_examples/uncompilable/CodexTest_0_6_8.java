import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_8 { 
  @Test
    public void testUncaughtExceptionHandler() {
    final AtomicReference<Throwable> caught = new AtomicReference<Throwable>();
    Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        caught.set(e);
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(h);
    try {
      throw new RuntimeException();
    } catch (Throwable t) {
      // ignored
    }
    assertNotNull(caught.get());
  }
}