import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_21 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler == null) {
      try {
        throw new NullPointerException();
      } catch (NullPointerException e) {
        assertTrue(e.getClass().getName().startsWith("com.google.gwt.core.client"));
        assertTrue(e.getStackTrace()[0].getClassName().startsWith("com.google.gwt.core.client"));
      }
    } else {
      try {
        throw new NullPointerException();
      } catch (NullPointerException e) {
        handler.onUncaughtException(e);
      }
    }
  }
}