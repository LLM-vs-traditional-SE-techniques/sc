import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_21 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler original = GWT.getUncaughtExceptionHandler();
    try {
      UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
        }
      };
      GWT.setUncaughtExceptionHandler(handler);
      assertEquals(handler, GWT.getUncaughtExceptionHandler());
    } finally {
      GWT.setUncaughtExceptionHandler(original);
    }
  }
}