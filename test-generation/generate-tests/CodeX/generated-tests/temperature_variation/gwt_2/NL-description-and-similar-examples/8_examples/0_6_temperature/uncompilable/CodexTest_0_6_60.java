import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_60 { 
  @Test
  public void testUncaughtExceptionHandler() {
    try {
      throw new RuntimeException("foo");
    } catch (RuntimeException e) {
      UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
      if (handler == null) {
        fail("GWT.getUncaughtExceptionHandler() is null");
      } else {
        handler.onUncaughtException(e);
      }
    }
  }
}