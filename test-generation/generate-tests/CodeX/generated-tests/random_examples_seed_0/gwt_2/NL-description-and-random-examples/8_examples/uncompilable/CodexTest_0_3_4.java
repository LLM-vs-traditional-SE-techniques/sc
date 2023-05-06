import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_4 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        // Do nothing.
      }
    };
    UncaughtExceptionHandler oldHandler = Thread.getUncaughtExceptionHandler();
    Thread.setUncaughtExceptionHandler(handler);
    try {
      assertEquals(handler, Thread.getUncaughtExceptionHandler());
    } finally {
      Thread.setUncaughtExceptionHandler(oldHandler);
    }
  }
}