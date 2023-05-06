import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_97 { 
  @Test
  public static void testDefaultUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull(handler);
    String msg = "Expected that the UncaughtExceptionHandler is a "
        + "DefaulUncaughtExceptionHandler but it was a " + handler.getClass().getCanonicalName();
    assertTrue(msg, handler instanceof DefaultUncaughtExceptionHandler);
  }
}