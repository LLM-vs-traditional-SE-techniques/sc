import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_3 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler h1 = GWT.getUncaughtExceptionHandler();
    UncaughtExceptionHandler h2 = GWT.getUncaughtExceptionHandler();
    assertEquals(h1, h2);
  }
}