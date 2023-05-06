import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_1 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread thread, Throwable ex) {
        System.out.println("Uncaught exception in thread " + thread.getName() + ": " + ex.getMessage());
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    Thread.getDefaultUncaughtExceptionHandler();
  }
}