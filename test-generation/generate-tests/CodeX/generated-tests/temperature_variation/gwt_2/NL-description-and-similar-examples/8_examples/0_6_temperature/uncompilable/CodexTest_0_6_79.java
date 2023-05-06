import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_79 { 
  @Test
  public void testUncaughtExceptionHandler() {
    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = new Thread.UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Uncaught exception in thread: " + t);
      }
    };
    GWT.setUncaughtExceptionHandler(uncaughtExceptionHandler);
    assertEquals(uncaughtExceptionHandler, GWT.getUncaughtExceptionHandler());
  }
}