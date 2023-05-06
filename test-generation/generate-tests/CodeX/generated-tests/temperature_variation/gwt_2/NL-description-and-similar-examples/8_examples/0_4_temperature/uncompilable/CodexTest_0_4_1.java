import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_1 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final RuntimeException exception = new RuntimeException("test");
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler == null) {
      handler = new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
          throw new RuntimeException("test", e);
        }
      };
    }
    GWT.setUncaughtExceptionHandler(handler);
    try {
      throw exception;
    } catch (RuntimeException e) {
      assertSame(exception, e.getCause());
    }
  }
}