import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_41 { 
  @Test
  public void testUncaughtExceptionHandler() {
    try {
      GWT.setUncaughtExceptionHandler(null);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
    }
    GWT.setUncaughtExceptionHandler(GWT.getUncaughtExceptionHandler());
  }
}