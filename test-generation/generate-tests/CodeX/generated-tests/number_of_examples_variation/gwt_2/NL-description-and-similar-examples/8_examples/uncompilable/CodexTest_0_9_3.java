import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_3 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler testHandler = new UncaughtExceptionHandler() {
      @Override public void onUncaughtException(Throwable e) {
        caught.set(e);
      }
    };
    GWT.setUncaughtExceptionHandler(testHandler);
    try {
      throw new RuntimeException("test");
    } catch (RuntimeException e) {
      System.err.println("The next exception is expected:");
      e.printStackTrace();
    }
    assertNotNull("UncaughtExceptionHandler.onUncaughtException() not called", caught.get());
    GWT.setUncaughtExceptionHandler(null);
  }
}