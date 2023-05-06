import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_67 { 
  @Test
  private final UncaughtExceptionHandler uncaughtExceptionHandler = new UncaughtExceptionHandler() {
    @Override
    public void onUncaughtException(Throwable e) {
      GwtReflectionUtils.log("onUncaughtException", e);
    }
  };
  public void testUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(uncaughtExceptionHandler);
    assertEquals(uncaughtExceptionHandler, GWT.getUncaughtExceptionHandler());
  }
"""
}