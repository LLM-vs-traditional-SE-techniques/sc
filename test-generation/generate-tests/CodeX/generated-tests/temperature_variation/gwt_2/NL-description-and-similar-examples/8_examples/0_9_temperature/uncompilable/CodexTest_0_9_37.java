import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_37 { 
  @Test
  public void testUncaughtExceptionHandler() {
    init();
    UncaughtExceptionHandler handler1 = GWT.getUncaughtExceptionHandler();
    UncaughtExceptionHandler handler2 = GWT.getUncaughtExceptionHandler();
    // Handlers should be the same
    assertEquals(handler1, handler2);
    // Handler should include the root exception
    assertTrue(handler1.toString().contains("com.google.gwt.core.client.JavaScriptException: (null)"));
  }
```
}