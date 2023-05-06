import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_17 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler expected = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
      }
    };
    GWT.setUncaughtExceptionHandler(expected);
    assertEquals(expected, GWT.getUncaughtExceptionHandler());
  }
}