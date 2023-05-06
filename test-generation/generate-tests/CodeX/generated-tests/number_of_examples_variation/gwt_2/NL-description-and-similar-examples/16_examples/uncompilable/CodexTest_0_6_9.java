import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_9 { 
  @Test
    public void testGetUncaughtExceptionHandler() throws Exception {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        fail("unexpected uncaught exception");
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    assertEquals(handler, GWT.getUncaughtExceptionHandler());
  }
}