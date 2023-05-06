import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_4 { 
  @Test
  public void testSetAndGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
       // Nothing.
      }
    };
    // Place a different handler than the one being used by the core,
    // so that we can check what happens when we try to place the handler
    // for a thread that does not belong to the core.
    GWT.setUncaughtExceptionHandler(handler);
    // Check that the handler was indeed changed.
    assertEquals(handler, GWT.getUncaughtExceptionHandler());
    // Try putting the current handler back.
    GWT.setUncaughtExceptionHandler(sUncaughtExceptionHandler);
    assertEquals(sUncaughtExceptionHandler, GWT.getUncaughtExceptionHandler());
    // Now try to put the handler of a thread that does not belong to the core.
    GWT.setUncaughtExceptionHandler(Thread.currentThread(), handler);
    // Check that the current handler still applies.
    assertEquals(sUncaughtExceptionHandler, GWT.getUncaughtExceptionHandler());
    // Check that the one we placed was the one returned.
    assertEquals(handler, GWT.getUncaughtExceptionHandler(Thread.currentThread()));
  }
}