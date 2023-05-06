import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_18 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler originalHandler = GWT.getUncaughtExceptionHandler();
    UncaughtExceptionHandler newHandler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        // Do nothing.
      }
    };
    GWT.setUncaughtExceptionHandler(newHandler);
    assertEquals(newHandler, GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(originalHandler);
    assertEquals(originalHandler, GWT.getUncaughtExceptionHandler());
  }
}