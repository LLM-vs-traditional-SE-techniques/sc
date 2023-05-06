import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_19 { 
  @Test
   public void testGetUncaughtExceptionHandler() {
    final Object nullValue = new Object();
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    UncaughtExceptionHandler newHandler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        System.err.println("new uncaughtExceptionHandler invoked");
        uncaughtException = nullValue;
      }
    };
    GWT.setUncaughtExceptionHandler(newHandler);
    GWT.setUncaughtExceptionHandler(null);
    assertEquals(nullValue, uncaughtException);
}