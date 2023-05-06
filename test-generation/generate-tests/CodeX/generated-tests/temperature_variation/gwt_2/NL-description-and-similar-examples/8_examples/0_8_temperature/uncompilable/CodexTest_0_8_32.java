import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_32 { 
  @Test
  private static class TestUncaughtExceptionHandler implements UncaughtExceptionHandler {
    public void onUncaughtException(Throwable e) {
      assertTrue("Should fail only when script mode enabled", GWT.isScript());
    }
  }
  public void testUncaughtException() {
    GWT.setUncaughtExceptionHandler(new TestUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(null);
  }
```
}