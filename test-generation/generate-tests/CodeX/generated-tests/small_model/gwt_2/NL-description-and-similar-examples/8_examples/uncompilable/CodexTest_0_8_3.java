import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_3 { 
  @Test
  public void testUncaughtExceptionHandler(){
    UncaughtExceptionHandler handler = Helpers.getUncaughtExceptionHandler();
    assertEquals("The uncaught exception handler is not what is set on the GWT side.", handler, GWT.UncaughtExceptionHandler);
    assertEquals("The uncaught exception handler is not what is set on the native side.", handler, com.google.gwt.core.client.GWT.getUncaughtExceptionHandler());
  }
}