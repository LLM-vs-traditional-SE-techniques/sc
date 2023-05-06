import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
      UncaughtExceptionHandler expected = sUncaughtExceptionHandler;
      sUncaughtExceptionHandler = new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
          throw new RuntimeException("onUncaughtException() has not been overridden, but is called");
        }
      };
      GWT.getUncaughtExceptionHandler();
      sUncaughtExceptionHandler = expected;
    }
```
}