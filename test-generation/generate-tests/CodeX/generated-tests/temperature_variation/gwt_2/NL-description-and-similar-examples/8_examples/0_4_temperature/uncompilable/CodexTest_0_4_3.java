import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_3 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler original = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        fail("GWT.getUncaughtExceptionHandler() should return the original handler");
      }
    });
    GWT.setUncaughtExceptionHandler(original);
  }
}