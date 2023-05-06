import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_14 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (GWT.isClient()) {
      assertTrue(handler instanceof GWT.UncaughtExceptionHandler);
    } else {
      assertTrue(handler instanceof GWT.DefaultUncaughtExceptionHandler);
    }
  }
}