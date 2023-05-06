import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_68 { 
  @Test
  public void testUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        assertTrue(e instanceof NullPointerException);
        assertEquals("test", e.getMessage());
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(new NullPointerException("test"));
  }
}