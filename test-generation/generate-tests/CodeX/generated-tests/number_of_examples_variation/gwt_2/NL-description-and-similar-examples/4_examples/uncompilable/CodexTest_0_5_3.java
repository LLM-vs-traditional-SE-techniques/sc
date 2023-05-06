import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_3 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        assertTrue(e instanceof IllegalArgumentException);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(new IllegalArgumentException("test"));
  }
}