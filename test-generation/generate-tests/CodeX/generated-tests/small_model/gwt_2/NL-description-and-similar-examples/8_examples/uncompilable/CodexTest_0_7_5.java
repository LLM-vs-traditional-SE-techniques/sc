import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_5 { 
  @Test
  public void testUncaughtExceptionHandlerAndThrowable() {
    try {
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
          assertNotNull("onUncaughtException should be called with a non-null argument", e);
        }
      });
      throw new RuntimeException("Test failed");
    } catch (Throwable e) {
      if (GWT.isScript()) {
        assertNotNull("onUncaughtException should be called with a non-null argument", e);
      }
    }
  }
}