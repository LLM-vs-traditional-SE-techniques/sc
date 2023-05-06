import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_32 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
      }
    });
    assertNotSame(ueh, GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(ueh);
    assertEquals(ueh, GWT.getUncaughtExceptionHandler());
  }
}