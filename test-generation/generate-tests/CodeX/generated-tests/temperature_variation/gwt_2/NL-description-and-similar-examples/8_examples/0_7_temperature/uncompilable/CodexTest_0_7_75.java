import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_75 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final RuntimeException exception = new RuntimeException();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertSame(exception, e);
      }
    });
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(exception);
    } finally {
      GWT.setUncaughtExceptionHandler(null);
    }
  }
}