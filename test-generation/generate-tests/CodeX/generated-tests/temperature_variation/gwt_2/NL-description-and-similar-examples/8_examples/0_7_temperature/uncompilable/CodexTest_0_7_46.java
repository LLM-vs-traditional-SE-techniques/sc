import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_46 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        assertTrue(GWT.getUncaughtExceptionHandler() == this);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(new Throwable());
  }
}