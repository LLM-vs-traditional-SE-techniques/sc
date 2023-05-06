import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_6 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(new Throwable());
      fail("Expected exception");
    } catch (Throwable e) {
      // expected
    }
  }
}