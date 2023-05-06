import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_28 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler uncaughtExceptionHandler = GWT.getUncaughtExceptionHandler();
    assertNotNull(uncaughtExceptionHandler);
    assertTrue(uncaughtExceptionHandler instanceof GWT.UncaughtExceptionHandler);
  }
}