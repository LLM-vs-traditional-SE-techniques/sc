import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_78 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(null);
    try {
      // Should throw an NPE because the handler is null
      GWT.log("test", new NullPointerException());
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
    GWT.setUncaughtExceptionHandler(handler);
  }
}