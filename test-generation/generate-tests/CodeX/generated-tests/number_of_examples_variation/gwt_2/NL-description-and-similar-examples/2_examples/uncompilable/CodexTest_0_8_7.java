import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_7 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler originalHandler = GWT.getUncaughtExceptionHandler();
    assertTrue(originalHandler != null);
    UncaughtExceptionHandler newHandler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        // Do something.
      }
    };
    GWT.setUncaughtExceptionHandler(newHandler);
    assertEquals(newHandler, GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(originalHandler);
    assertEquals(originalHandler, GWT.getUncaughtExceptionHandler());
  }
}