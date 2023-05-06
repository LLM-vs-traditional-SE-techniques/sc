import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_27 { 
  @Test
  public void testUncaughtExceptionHandler() {
    // try registering the handler twice
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable throwable) {
      }
    });
    try {
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        public void onUncaughtException(Throwable throwable) {
        }
      });
      fail("Should have thrown an IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }
}