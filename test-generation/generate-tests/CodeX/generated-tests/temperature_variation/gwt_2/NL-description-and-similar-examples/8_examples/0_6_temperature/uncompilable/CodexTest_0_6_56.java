import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_56 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final RuntimeException runtimeException = new RuntimeException();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        if (runtimeException.equals(e)) {
          return;
        }
        fail();
      }
    });
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(runtimeException);
    } finally {
      GWT.setUncaughtExceptionHandler(null);
    }
  }
}