import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler ueh =
      new UncaughtExceptionHandler() {
        public void uncaughtException(Thread t, Throwable e) {
          fail("UncaughtExceptionHandler was called");
        }
      };
    Thread.setDefaultUncaughtExceptionHandler(ueh);
    assertEquals(ueh, Thread.getDefaultUncaughtExceptionHandler());
  }
}