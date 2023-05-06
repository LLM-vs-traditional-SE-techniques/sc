import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_86 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler original = GWT.getUncaughtExceptionHandler();
    final boolean[] called = new boolean[1];
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        called[0] = true;
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
      // ignore
    }
    assertTrue(called[0]);
    GWT.setUncaughtExceptionHandler(original);
  }
}