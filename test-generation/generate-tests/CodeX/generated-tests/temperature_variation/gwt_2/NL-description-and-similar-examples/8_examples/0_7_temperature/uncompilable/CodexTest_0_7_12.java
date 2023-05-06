import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_12 { 
  @Test
    public void testUncaughtExceptionHandler() throws Exception {
    TestUncaughtExceptionHandler handler = new TestUncaughtExceptionHandler();
    Thread.currentThread().setUncaughtExceptionHandler(handler);
    GWT.getUncaughtExceptionHandler().onUncaughtException(new Throwable());
    assertEquals(handler.exception, handler.caught);
  }
```
}