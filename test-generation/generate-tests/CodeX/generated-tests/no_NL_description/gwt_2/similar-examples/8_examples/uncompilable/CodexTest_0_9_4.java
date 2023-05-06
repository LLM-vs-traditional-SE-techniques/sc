import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_4 { 
  @Test
  public void testUncaughtException() {
    Thread.UncaughtExceptionHandler handler = Thread.getDefaultUncaughtExceptionHandler();
    Thread.setDefaultUncaughtExceptionHandler(new TestUncaughtExceptionHandler());
    try {
      Thread.start(new TestUncaughtExceptionHandler(), "testUncaughtException", 1);
      Thread.sleep(50);
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(handler);
    }
  }
  private static class TestUncaughtExceptionHandler implements Runnable, Thread.UncaughtExceptionHandler {
    @Override
    public void run() {
      throw new RuntimeException();
    }
    @Override
    public void uncaughtException(Thread t, Throwable e) {
      if (t.equals(Thread.currentThread())) {
        throw new RuntimeException();
      }
    }
  }
}