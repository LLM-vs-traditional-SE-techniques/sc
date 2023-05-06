import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_78 { 
  @Test
  public void testGWTGetUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        assertEquals(e.getClass(), new UncaughtExceptionHandler() {
          public void onUncaughtException(Throwable e) {
            assertEquals(e.getClass(), GWT.getUncaughtExceptionHandler().getClass());
          }
        });
      }
    });
  }
```
}