import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_11 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler == null) {
      handler = new UncaughtExceptionHandler() {
        public void onUncaughtException(Throwable e) {
          throw new RuntimeException(e);
        }
      };
      GWT.setUncaughtExceptionHandler(handler);
    }
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException());
    } catch (RuntimeException e) {
      // Expected.
    }
  }
}