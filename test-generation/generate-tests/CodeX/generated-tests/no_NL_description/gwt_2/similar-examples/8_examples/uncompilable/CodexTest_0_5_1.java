import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_1 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      public void uncaughtException(Thread t, Throwable e) {
        // Do nothing.
      }
    };
    UncaughtExceptionHandler oldHandler = Thread.getDefaultUncaughtExceptionHandler();
    Thread.setDefaultUncaughtExceptionHandler(handler);
    try {
      assertEquals(handler, Thread.getDefaultUncaughtExceptionHandler());
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(oldHandler);
    }
  }
}