import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_42 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
      final AtomicReference<Throwable> uncaughtException = new AtomicReference<Throwable>();
      UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
          uncaughtException.set(e);
        }
      };
      UncaughtExceptionHandler oldHandler = GWT.getUncaughtExceptionHandler();
      GWT.setUncaughtExceptionHandler(handler);
      GWT.reportUncaughtException(e);
      GWT.setUncaughtExceptionHandler(oldHandler);
      assertEquals(e, uncaughtException.get());
    }
  }
}