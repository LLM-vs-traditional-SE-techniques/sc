import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_1 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
  UncaughtExceptionHandler handler1 = GWT.getUncaughtExceptionHandler();
  // by default GWT.UncaughtExceptionHandler is used
  assertEquals(handler1.getClass().getCanonicalName(), GWT.UncaughtExceptionHandler.class.getCanonicalName());
  UncaughtExceptionHandler handler2 = new UncaughtExceptionHandler.class.getCanonicalName();
  GWT.setUncaughtExceptionHandler(handler2);
  assertEquals(handler2, GWT.getUncaughtExceptionHandler());
  }
}