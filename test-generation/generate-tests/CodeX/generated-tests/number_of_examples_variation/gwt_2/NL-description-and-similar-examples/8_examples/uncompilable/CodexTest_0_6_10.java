import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_10 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler original = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        public void onUncaughtException(Throwable e) {
          throw new RuntimeException("nope");
        }
      });
      try {
        throw new RuntimeException("expected");
      } catch (RuntimeException e) {
        assertEquals("expected", e.getMessage());
      }
    } finally {
      GWT.setUncaughtExceptionHandler(original);
    }
  }
}