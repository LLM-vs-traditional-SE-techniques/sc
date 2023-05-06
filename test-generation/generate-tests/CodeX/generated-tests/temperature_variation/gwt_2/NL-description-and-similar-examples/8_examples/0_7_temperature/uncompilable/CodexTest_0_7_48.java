import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_48 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler originalUncaughtExceptionHandler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
      }
    });
    // TODO(rch): create a test of the UncaughtExceptionHandler
    GWT.setUncaughtExceptionHandler(originalUncaughtExceptionHandler);
  }
}