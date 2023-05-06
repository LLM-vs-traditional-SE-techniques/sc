import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_38 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler old = GWT.getUncaughtExceptionHandler();
    try {
      final boolean[] called = new boolean[1];
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
          called[0] = true;
        }
      });
      throw new RuntimeException();
    } finally {
      GWT.setUncaughtExceptionHandler(old);
    }
    assertTrue(called[0]);
  }
}