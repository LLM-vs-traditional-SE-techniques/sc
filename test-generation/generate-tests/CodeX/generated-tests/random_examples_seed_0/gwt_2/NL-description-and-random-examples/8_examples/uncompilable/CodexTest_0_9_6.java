import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  @Test
  public void testExceptionHandlerRegistered() {
    final UncaughtExceptionHandler handler = mock(UncaughtExceptionHandler.class);
    Thread.setDefaultUncaughtExceptionHandler(handler);
    final UncaughtExceptionHandler h = ThreadConfiguration.getUncaughtExceptionHandler();
    assertEquals(handler,h);
  }
}