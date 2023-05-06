import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_91 { 
  @Test
  private static final UncaughtExceptionHandler BAR = new UncaughtExceptionHandler() {
    public void onUncaughtException(Throwable e) {
    }
  };
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler old = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(BAR);
    try {
      assertEquals(BAR, GWT.getUncaughtExceptionHandler());
    } finally {
      GWT.setUncaughtExceptionHandler(old);
    }
  }
}