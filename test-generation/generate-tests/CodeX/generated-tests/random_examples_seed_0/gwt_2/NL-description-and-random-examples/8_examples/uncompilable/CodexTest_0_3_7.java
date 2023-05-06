import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_7 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      public void uncaughtException(Thread t, Throwable e) {
        throw new RuntimeException(e);
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    Thread.currentThread().setUncaughtExceptionHandler(handler);
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
      assertTrue(e.getCause() instanceof RuntimeException);
    }
  }
}