import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_1 { 
  @Test
  public void testCorrectUncaughtExceptionHandlersCalled() {
    final AtomicInteger handler1Calls = new AtomicInteger();
    final AtomicInteger handler2Calls = new AtomicInteger();
    GWT.setUncaughtExceptionHandler((e) -> handler1Calls.incrementAndGet());
    GWT.setUncaughtExceptionHandler(
        (e) -> handler2Calls.incrementAndGet(),
        new RuntimeException("overwrite me!"));
    throw new RuntimeException("test");
    assertEquals("handler1 called", 0, handler1Calls.get());
    assertEquals("handler2 called", 1, handler2Calls.get());
}
}