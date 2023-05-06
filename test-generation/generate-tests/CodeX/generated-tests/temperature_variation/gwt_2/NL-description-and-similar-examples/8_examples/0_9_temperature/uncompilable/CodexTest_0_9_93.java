import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_93 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final RuntimeException RE = new RuntimeException();
    UncaughtExceptionHandler defaultHandler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler( new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEquals(RE, e);
      }
    });
    try {
      throw RE;
    } finally {
      GWT.setUncaughtExceptionHandler(defaultHandler);
    }
  }
}