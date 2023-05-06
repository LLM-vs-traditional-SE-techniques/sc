import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_7 { 
  @Test
  public void testRuntimeExceptionIsThrownToHandler() throws Throwable {
    Thread thread = new Thread() {
      @Override
      public void run() {
        throw new RuntimeException("runtime exception");
      }
    };
    UncaughtExceptionHandler oldHandler = Thread
        .getDefaultUncaughtExceptionHandler();
    Thread.setDefaultUncaughtExceptionHandler(mHandler);
    Throwable thrown = null;
    try {
      thread.start();
    } catch (Throwable t) {
      thrown = t;
    } finally {
      Thread
          .setDefaultUncaughtExceptionHandler(oldHandler);
    }
    assertNotNull(thrown);
    assertTrue(thrown instanceof RuntimeException);
    assertEquals(thrown.getMessage(), "runtime exception");
    assertEquals(mHandler.getThrown().getMessage(), "runtime exception");
  }
}