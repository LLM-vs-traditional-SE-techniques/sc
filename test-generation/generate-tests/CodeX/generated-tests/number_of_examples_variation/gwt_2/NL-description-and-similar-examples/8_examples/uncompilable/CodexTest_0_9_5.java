import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  @Test
  public void testUncaughtExceptionHandler() {
    MyExceptionHandler exHandler = new MyExceptionHandler();
    DefaultUncaughtExceptionHandler.setUncaughtExceptionHandler(exHandler);
    MyExceptionHandler result = DefaultUncaughtExceptionHandler.getUncaughtExceptionHandler();
    assertEquals(exHandler, result);
  }
}