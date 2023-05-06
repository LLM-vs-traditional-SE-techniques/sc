import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_9 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler h = new UncaughtExceptionHandler() {
      public void uncaughtException(Thread t, Throwable e) {
        assertEquals(Thread.currentThread(), t);
        throw new AssertionFailedError(e.toString());
      }
    };
    UncaughtExceptionHandler oldh = Thread.getUncaughtExceptionHandler();
    Thread.setUncaughtExceptionHandler(h);
    try {
      throw new Throwable();
    } finally {
      Thread.setUncaughtExceptionHandler(oldh);
    }
  }

}