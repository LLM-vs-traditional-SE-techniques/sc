import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_8 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final Throwable[] throwable = new Throwable[1];
    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread thread, Throwable throwable) {
        throwable[0] = throwable;
      }
    });
    Log.w(TAG, "Message", new RuntimeException("RuntimeException"));
    assertEquals(RuntimeException.class, throwable[0].getClass());
    assertEquals("RuntimeException", throwable[0].getMessage());
  }
}