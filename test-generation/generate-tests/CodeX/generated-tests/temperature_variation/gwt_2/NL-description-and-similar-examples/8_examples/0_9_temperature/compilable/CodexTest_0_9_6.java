import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  @Test
  private void throwExpectedException(int timeout) throws InterruptedException {
    Thread t = new Thread() {
      @Override
      public void run() {
        throw new RuntimeException("Expected exception");
      }
    };
    Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread th, Throwable keyStoreException) { }
    };
    t.setUncaughtExceptionHandler(h);
    t.start();
    t.join(timeout);
  }
}