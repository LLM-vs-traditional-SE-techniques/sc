import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_3 { 
  @Test
  public void testUncaughtExceptionHandler() throws Exception {
    UncaughtExceptionHandler oldHandler = Thread.getDefaultUncaughtExceptionHandler();
    try {
      final UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
          // Do nothing.
        }
      };
      Thread.setDefaultUncaughtExceptionHandler(handler);
      assertEquals(handler, Thread.getDefaultUncaughtExceptionHandler());
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(oldHandler);
    }
  }
}