import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_8 { 
  @Test
  public void testUncaughtExceptionHandler() {
    Thread.UncaughtExceptionHandler originalHandler =
        Thread.getUncaughtExceptionHandler();
    Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        throw new RuntimeException(e);
      }
    };
    Thread.setUncaughtExceptionHandler(handler);
    try {
      Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
          throw new RuntimeException("expected");
        }
      });
      thread.start();
      thread.join();
      fail("should have thrown an exception");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    } catch (RuntimeException e) {
      assertEquals("expected", e.getCause().getMessage());
    } finally {
      Thread.setUncaughtExceptionHandler(originalHandler);
    }
  }
}