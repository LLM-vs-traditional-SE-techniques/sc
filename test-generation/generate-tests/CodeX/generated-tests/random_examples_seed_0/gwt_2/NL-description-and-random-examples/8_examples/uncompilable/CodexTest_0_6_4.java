import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_4 { 
  @Test
  public void testUncaughtExceptionHandlerIsSet() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    assertTrue(Thread.getDefaultUncaughtExceptionHandler() == handler);
    Thread.setDefaultUncaughtExceptionHandler(null);
  }
}