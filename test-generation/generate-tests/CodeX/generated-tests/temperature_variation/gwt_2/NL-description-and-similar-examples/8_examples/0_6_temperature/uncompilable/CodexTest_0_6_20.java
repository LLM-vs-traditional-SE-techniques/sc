import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_20 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException("test exception");
      }
    });
    Throwable caught = null;
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException("real exception"));
    } catch (RuntimeException e) {
      caught = e;
    }
    assertNotNull("expected an exception to be thrown", caught);
    assertEquals("test exception", caught.getMessage());
    GWT.setUncaughtExceptionHandler(handler);
  }
}