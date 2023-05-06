import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_23 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler ueh1 = GWT.getUncaughtExceptionHandler();
    UncaughtExceptionHandler ueh2 = GWT.getUncaughtExceptionHandler();
    assertEquals(ueh1, ueh2);
  }
}