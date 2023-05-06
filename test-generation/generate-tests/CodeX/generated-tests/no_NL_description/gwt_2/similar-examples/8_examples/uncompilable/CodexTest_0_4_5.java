import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_5 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        throw new RuntimeException(e);
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    Throwable throwable = new Throwable();
    try {
      Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
      fail();
    } catch (RuntimeException e) {
      assertSame(throwable, e.getCause());
    }
  }
}