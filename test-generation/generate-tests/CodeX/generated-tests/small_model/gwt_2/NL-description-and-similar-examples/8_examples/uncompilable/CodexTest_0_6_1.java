import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_1 { 
  @Test
  public void testSetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        // empty
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    assertSame(handler, GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(null);
    assertNull(GWT.getUncaughtExceptionHandler());
  }
}