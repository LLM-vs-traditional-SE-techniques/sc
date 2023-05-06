import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_19 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
        assertEquals(handler, GWT.getUncaughtExceptionHandler());
      }
    });
    GWT.setUncaughtExceptionHandler(GWT.getUncaughtExceptionHandler());
    GWT.getUncaughtExceptionHandler().onUncaughtException(new Throwable());;
  }
```
}