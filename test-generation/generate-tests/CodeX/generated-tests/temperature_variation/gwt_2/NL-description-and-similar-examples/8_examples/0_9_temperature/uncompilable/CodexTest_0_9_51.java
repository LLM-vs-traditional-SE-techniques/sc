import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_51 { 
  @Test
  private static class TestUncaughtExceptionHandler implements UncaughtExceptionHandler {
    public void onUncaughtException(Throwable t) {
      lastThrowable = t;
    }
  }
```
}