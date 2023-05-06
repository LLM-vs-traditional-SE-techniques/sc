import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_54 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler uncaughtExceptionHandler = GWT.getUncaughtExceptionHandler();
    assertNotNull(uncaughtExceptionHandler);
    GWT.setUncaughtExceptionHandler(null);
    assertNull(GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(uncaughtExceptionHandler);
    assertSame(uncaughtExceptionHandler, GWT.getUncaughtExceptionHandler());
  }
}