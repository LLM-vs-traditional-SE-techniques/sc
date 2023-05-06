import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_4 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final List<String> log = new ArrayList<String>();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        log.add(e.getMessage());
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(new Throwable("Hello"));
    assertEquals(Arrays.asList("Hello"), log);
  }
```
}