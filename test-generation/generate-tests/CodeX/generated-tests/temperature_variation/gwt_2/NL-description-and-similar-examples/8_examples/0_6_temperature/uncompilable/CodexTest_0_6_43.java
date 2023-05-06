import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_43 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull("GWT.getUncaughtExceptionHandler() must not return null", handler);
    try {
      GWT.setUncaughtExceptionHandler(null);
      fail("GWT.setUncaughtExceptionHandler(null) must throw an AssertionError");
    } catch (AssertionError expected) {
    }
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        // Do nothing
      }
    });
    assertNotNull("GWT.getUncaughtExceptionHandler() must not return null",
        GWT.getUncaughtExceptionHandler());
  }
}