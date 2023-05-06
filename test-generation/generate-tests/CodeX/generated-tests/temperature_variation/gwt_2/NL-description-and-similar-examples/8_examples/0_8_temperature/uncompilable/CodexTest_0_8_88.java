import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_88 { 
  @Test
  public void testUncaughtExceptionHandler() {
    try {
      throw new Exception();
    } catch (Throwable t) {
      UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
      if (ueh == null) {
        fail();
      }
      ueh.onUncaughtException(t);
    }
  }
}