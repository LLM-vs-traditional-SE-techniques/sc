import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_24 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler originalHandler = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(null);
      assertNull(GWT.getUncaughtExceptionHandler());
    } finally {
      GWT.setUncaughtExceptionHandler(originalHandler);
    }
  }
}