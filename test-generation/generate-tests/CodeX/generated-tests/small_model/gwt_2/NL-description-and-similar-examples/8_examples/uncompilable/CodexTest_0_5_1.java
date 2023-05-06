import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_1 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler oldHandler = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        public void onUncaughtException(Throwable e) {
          // Do nothing.
        }
      });
      assertEquals(GWT.getUncaughtExceptionHandler(), GWT.getUncaughtExceptionHandler());
    } finally {
      GWT.setUncaughtExceptionHandler(oldHandler);
    }
  }
}