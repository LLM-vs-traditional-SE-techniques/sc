import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_4 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        throw new RuntimeException("Uncaught exception handler called");
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    try {
      throw new RuntimeException("Uncaught exception");
    } catch (RuntimeException e) {
      // Expected.
    }
  }
}