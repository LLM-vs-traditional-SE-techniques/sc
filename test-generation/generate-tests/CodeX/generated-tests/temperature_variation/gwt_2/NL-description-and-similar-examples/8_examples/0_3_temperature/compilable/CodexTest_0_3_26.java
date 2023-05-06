import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_26 { 
  @Test
  public void testUncaughtExceptionHandler() {
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(new Throwable());
      fail("Expected an exception");
    } catch (RuntimeException e) {
      // expected
    }
  }
}