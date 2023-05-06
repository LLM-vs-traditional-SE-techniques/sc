import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_78 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    if (ueh == null) {
      // This test only works when there is an exception handler.
      return;
    }
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException(e);
      }
    });
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException());
    } catch (RuntimeException expected) {
      // expected
    }
  }
}