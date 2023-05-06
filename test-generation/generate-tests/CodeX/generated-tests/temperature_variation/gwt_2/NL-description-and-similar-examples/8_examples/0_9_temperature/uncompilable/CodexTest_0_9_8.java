import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_8 { 
  @Test
  public static void testUncaughtExceptionHandlerStatus() {
    UncaughtExceptionHandler newHandler = new UncaughtExceptionHandler();
    UncaughtExceptionHandler previousHandler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(newHandler);
    assertEquals(newHandler, GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(previousHandler);
  }
}