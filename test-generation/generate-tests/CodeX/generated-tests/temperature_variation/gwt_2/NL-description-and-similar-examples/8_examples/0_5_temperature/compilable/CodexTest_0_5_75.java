import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_75 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(new Throwable());
      fail("Expected RuntimeException");
    } catch (RuntimeException e) {
      // expected
    }
  }
}