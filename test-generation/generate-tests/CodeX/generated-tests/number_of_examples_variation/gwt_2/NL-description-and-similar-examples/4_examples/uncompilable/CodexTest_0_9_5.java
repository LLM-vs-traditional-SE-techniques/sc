import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final Throwable t = new Throwable();
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
     public void onUncaughtException(Throwable e) {
        assertEquals(t, e);
      }
    };
    UncaughtExceptionHandler oldHandler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(handler);
    GWT.reportUncaughtException(t);
    GWT.setUncaughtExceptionHandler(oldHandler);
  }
}