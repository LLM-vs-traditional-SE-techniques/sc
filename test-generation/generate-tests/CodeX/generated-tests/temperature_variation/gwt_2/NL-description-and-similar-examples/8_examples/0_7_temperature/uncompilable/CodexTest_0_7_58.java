import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_58 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    UncaughtExceptionHandler newHandler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
      }
    };
    GWT.setUncaughtExceptionHandler(newHandler);
    assertEquals(newHandler, GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(handler);
  }
}