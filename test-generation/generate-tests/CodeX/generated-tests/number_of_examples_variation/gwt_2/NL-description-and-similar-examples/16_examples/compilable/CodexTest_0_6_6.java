import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_6 { 
  @Test
  public void testSetUncaughtExceptionHandler_null() {
    try {
      GWT.setUncaughtExceptionHandler(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // pass
    }
  }
}