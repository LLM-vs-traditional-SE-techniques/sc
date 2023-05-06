import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_2 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler oldHandler = Thread.getDefaultUncaughtExceptionHandler();
    try {
      Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
          throw new RuntimeException(e);
        }
      });
      try {
        throw new Exception("foo");
      } catch (Exception e) {
        assertEquals(e.getMessage(), "foo");
      }
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(oldHandler);
    }
  }
}