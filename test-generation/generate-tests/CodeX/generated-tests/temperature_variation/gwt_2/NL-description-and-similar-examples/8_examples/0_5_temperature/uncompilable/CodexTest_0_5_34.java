import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_34 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler1 = GWT.getUncaughtExceptionHandler();
    UncaughtExceptionHandler handler2 = GWT.getUncaughtExceptionHandler();
    assertTrue(handler1 == handler2);
  }
}