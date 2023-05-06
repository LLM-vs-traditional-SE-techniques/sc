import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_9 { 
  @Test
  public void testMockito() {
    UncaughtExceptionHandler handler = mock(UncaughtExceptionHandler.class);
    Thread.setDefaultUncaughtExceptionHandler(handler);
    assertSame(handler, Thread.getDefaultUncaughtExceptionHandler());
  }
}