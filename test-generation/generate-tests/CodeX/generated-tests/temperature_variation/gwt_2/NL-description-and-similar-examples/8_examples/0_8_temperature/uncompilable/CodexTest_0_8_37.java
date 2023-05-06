import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_37 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler defaultHandler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
          throw new RuntimeException("unexpected");
        }
      });
    try {
      try {
        throw new RuntimeException("expected");
      } catch (RuntimeException expected) {
        // ignore
      }
    } finally {
      GWT.setUncaughtExceptionHandler(defaultHandler);
    }
  }
}