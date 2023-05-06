import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_9 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    try {
      final RuntimeException ex = new RuntimeException();
      GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
          assertEquals(ex, e);
          throw (RuntimeException)e;
        }
      });
      throw ex;
    } catch (RuntimeException e) {
      GWT.setUncaughtExceptionHandler(null);
    }
  }
}