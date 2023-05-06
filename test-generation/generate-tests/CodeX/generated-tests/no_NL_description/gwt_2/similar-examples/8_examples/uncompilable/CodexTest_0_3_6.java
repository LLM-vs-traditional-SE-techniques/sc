import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_6 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        uncaughtException = e;
      }
    };
    UncaughtExceptionHandler oldHandler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(handler);
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
      // ignore
    }
    assertNotNull(uncaughtException);
    GWT.setUncaughtExceptionHandler(oldHandler);
  }
}