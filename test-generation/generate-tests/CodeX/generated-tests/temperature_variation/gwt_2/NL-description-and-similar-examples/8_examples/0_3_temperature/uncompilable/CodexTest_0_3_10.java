import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_10 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler == null) {
      handler = new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
          throw new RuntimeException(e);
        }
      };
    }
    try {
      GWT.setUncaughtExceptionHandler(handler);
      GWT.getUncaughtExceptionHandler();
    } finally {
      GWT.setUncaughtExceptionHandler(null);
    }
  }
}