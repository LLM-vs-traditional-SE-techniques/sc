import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_50 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler newHandler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        // nothing to do
      }
    };
    UncaughtExceptionHandler oldHandler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(newHandler);
    try {
      Assert.assertEquals(newHandler, GWT.getUncaughtExceptionHandler());
    } finally {
      GWT.setUncaughtExceptionHandler(oldHandler);
    }
  }
}