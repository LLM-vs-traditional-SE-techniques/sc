import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_47 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        // Do nothing
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    Assert.assertEquals(handler, GWT.getUncaughtExceptionHandler());
  }
}