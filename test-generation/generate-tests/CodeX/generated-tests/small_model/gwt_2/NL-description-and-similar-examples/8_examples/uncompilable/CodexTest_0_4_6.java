import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_6 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        e.printStackTrace();
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    assertEquals(handler, GWT.getUncaughtExceptionHandler());
  }
}