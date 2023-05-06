import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_39 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
    try {
      GWT.setUncaughtExceptionHandler(null);
      GWT.getUncaughtExceptionHandler();
      fail("Should throw NullPointerException");
    } catch (NullPointerException e) {
      // Expected.
    }
  }
}