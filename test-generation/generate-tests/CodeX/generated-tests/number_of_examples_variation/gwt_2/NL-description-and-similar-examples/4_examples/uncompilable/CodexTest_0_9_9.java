import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_9 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
	  DefaultSchedulerTest.UncaughtExceptionHandler handler = new DefaultSchedulerTest.UncaughtExceptionHandler();
	  DefaultSchedulerTest.sUncaughtExceptionHandler = handler;
	  assertEquals(handler, UncaughtExceptionHandler.getUncaughtExceptionHandler());
  }
```
}