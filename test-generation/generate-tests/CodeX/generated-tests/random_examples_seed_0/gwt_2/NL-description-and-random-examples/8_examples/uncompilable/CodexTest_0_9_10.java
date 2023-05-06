import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_10 { 
  @Test
   public void testUncaughtExceptionHandlerGetSet() {
    ExceptionHandler handler = new ExceptionHandler();
    UncaughtExceptionHandler.setDefaultUncaughtExceptionHandler(handler);
    UncaughtExceptionHandler oldHandler = UncaughtExceptionHandler
        .getDefaultUncaughtExceptionHandler();
    assertEquals(oldHandler, handler);
  }
}