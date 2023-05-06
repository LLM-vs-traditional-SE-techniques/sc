import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_18 { 
  @Test
  public void testUncaughtExceptionHandler() {
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException());
      fail("Expected exception not thrown");
    } catch (RuntimeException e) {
      assertTrue(GWT.getUncaughtExceptionHandler().equals(GWT.getUncaughtExceptionHandler()));
    }
  }
}