import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_1 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(null);
      new Exception().printStackTrace();
      Assert.fail("Should have thrown an exception");
    } catch (Exception e) {
      // Test passes
    } finally {
      GWT.setUncaughtExceptionHandler(handler);
    }
  }
    
}