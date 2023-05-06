import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_5 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler expectedHandler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {}
    };
    GWT.setUncaughtExceptionHandler(expectedHandler);
    UncaughtExceptionHandler actualHandler = GWT.getUncaughtExceptionHandler();
    assertEquals(expectedHandler, actualHandler);
  }
  ```
}