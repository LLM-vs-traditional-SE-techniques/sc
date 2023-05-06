import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_3 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler originalExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
    try {
      Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread thread, Throwable ex) {
          exceptionHandlerGotCalled = true;
        }
      });
      lifecycle.transitionTo(Stage.FAILED);
      assertTrue(exceptionHandlerGotCalled);
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(originalExceptionHandler);
      exceptionHandlerGotCalled = false;
    }
  }
}