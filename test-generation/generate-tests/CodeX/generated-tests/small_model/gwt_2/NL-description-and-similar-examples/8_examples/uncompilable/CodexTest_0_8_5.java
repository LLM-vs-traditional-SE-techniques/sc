import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_5 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler old = GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        System.out.println("Uncaught Exception: " + e.getMessage());
      }
    });
    assertEquals(old, GWT.setUncaughtExceptionHandler(old));
  }
}