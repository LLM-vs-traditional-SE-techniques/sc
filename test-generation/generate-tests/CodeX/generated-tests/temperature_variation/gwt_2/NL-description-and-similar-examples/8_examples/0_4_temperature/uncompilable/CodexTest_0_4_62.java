import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_62 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertTrue(e instanceof RuntimeException);
      }
    });
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
      // ignore
    }
    GWT.setUncaughtExceptionHandler(ueh);
  }
}