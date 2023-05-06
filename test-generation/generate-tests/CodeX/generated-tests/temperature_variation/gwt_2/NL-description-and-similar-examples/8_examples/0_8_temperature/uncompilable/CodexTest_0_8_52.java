import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_52 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler uncaughtExceptionHandler = GWT.getUncaughtExceptionHandler();
    if (uncaughtExceptionHandler == null) {
      try {
        throw new Exception("test");
      } catch (Exception e) {
        assertNotNull(e.getStackTrace());
      }
    } else {
      uncaughtExceptionHandler.onUncaughtException(new RuntimeException());
    }
  }
```
}