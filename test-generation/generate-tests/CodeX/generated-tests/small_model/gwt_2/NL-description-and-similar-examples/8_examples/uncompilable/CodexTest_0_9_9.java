import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_9 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      public void uncaughtException(Thread thread, Throwable error) {
        assertNotNull(thread);
        assertTrue(thread.isAlive());
        assertNotNull(error);
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    assertSame(handler, GWT.getUncaughtExceptionHandler());
}