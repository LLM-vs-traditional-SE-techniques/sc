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
    final Throwable throwable = new Throwable();
    final UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread thread, Throwable ex) {
        assertEquals(throwable, ex);
      }
    };
    UncaughtExceptionHandler defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
    try {
      Thread.setDefaultUncaughtExceptionHandler(handler);
      Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(defaultHandler);
    }
  }
}