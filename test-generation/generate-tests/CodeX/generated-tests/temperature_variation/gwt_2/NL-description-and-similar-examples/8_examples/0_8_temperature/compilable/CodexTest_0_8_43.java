import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_43 { 
  @Test
  public void testUncaughtExceptionHandler() {
    GWT.UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    try {
      double d = 3.0;
    } catch (Throwable e) {
      handler.onUncaughtException(e);
    }
  }
}