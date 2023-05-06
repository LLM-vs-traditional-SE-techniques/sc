import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_4 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final Thread.UncaughtExceptionHandler initialHandler = GWT.getUncaughtExceptionHandler();
    try {
      final Thread.UncaughtExceptionHandler[] finalHandler = new Thread.UncaughtExceptionHandler[1];
      final Boolean[] wasCalled = new Boolean[] {Boolean.FALSE};
      final String[] moduleName = new String[1];
      GWT.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread thread, Throwable throwable) {
          finalHandler[0] = this;
          wasCalled[0] = Boolean.TRUE;
          moduleName[0] = GWT.getModuleName();
        }
      });
      GWT.runAsync(new RunAsyncCallback() {
        @Override
        public void onSuccess() {
          throw new RuntimeException("UncaughtExceptionHandler not called");
        }
        @Override
        public void onFailure(Throwable reason) {
          assertTrue("UncaughtExceptionHandler was called", wasCalled[0]);
          assertEquals("UncaughtExceptionHandler had correct module name",
              GWT.getModuleName(), moduleName[0]);
          assertEquals("UncaughtExceptionHandler had correct instance",
              finalHandler[0], GWT.getUncaughtExceptionHandler());
        }
      });
    } finally {
      GWT.setUncaughtExceptionHandler(initialHandler);
    }
  }
}