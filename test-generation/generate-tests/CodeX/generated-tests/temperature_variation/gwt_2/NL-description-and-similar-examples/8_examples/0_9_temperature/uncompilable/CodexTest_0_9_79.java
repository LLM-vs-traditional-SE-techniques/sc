import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_79 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
      UncaughtExceptionHandler realHandler = GWT.getUncaughtExceptionHandler();
      try {
        GWT.setUncaughtExceptionHandler(null);
        GWT.setUncaughtExceptionHandler(GWT.getUncaughtExceptionHandler());
        assertEquals(GWT.getUncaughtExceptionHandler(), null);
      } finally {
        GWT.setUncaughtExceptionHandler(realHandler);
      }
    }
}