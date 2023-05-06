import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_57 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        fail("GWT.getUncaughtExceptionHandler() should not return the handler set by GWT.setUncaughtExceptionHandler()");
      }
    });
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull("GWT.getUncaughtExceptionHandler() should not return null", handler);
    assertNotSame("GWT.getUncaughtExceptionHandler() should not return the handler set by GWT.setUncaughtExceptionHandler()", GWT.getUncaughtExceptionHandler(), GWT.getUncaughtExceptionHandler());
  }
}