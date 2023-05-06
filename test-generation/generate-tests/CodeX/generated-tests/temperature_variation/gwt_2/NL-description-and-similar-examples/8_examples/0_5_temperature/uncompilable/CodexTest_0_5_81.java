import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_81 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        // Do nothing
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    assertEquals(handler, GWT.getUncaughtExceptionHandler());
  }
}