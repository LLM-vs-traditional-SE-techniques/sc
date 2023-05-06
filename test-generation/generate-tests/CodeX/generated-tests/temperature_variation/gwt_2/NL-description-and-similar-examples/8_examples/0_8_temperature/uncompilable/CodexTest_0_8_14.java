import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_14 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler a = GWT.getUncaughtExceptionHandler();
    UncaughtExceptionHandler b = GWT.getUncaughtExceptionHandler();
    assertEquals("Expected the same instance", a, b);
  }
}