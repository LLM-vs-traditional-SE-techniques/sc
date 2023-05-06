import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_1 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler previousUncaughtExceptionHandler = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(null);
      assertEquals(null, GWT.getUncaughtExceptionHandler());
      GWT.setUncaughtExceptionHandler(previousUncaughtExceptionHandler);
      assertEquals(previousUncaughtExceptionHandler, GWT.getUncaughtExceptionHandler());
    } finally {
      GWT.setUncaughtExceptionHandler(previousUncaughtExceptionHandler);
    }
  }
```
}