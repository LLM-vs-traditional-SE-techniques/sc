import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_6 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
    try {
      UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
          throw new AssertionError("Should not have called uncaughtException");
        }
      };
      Thread.setDefaultUncaughtExceptionHandler(handler);
      Thread.getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new RuntimeException());
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(defaultHandler);
    }
  }
}