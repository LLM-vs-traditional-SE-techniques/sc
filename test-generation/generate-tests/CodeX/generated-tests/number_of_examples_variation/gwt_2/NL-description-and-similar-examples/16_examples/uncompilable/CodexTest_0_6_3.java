import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_3 { 
  @Test
   public void testGetUncaughtExceptionHandler() {
    try {
      UncaughtExceptionHandler oldHandler = GWT.getUncaughtExceptionHandler();
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        public void onUncaughtException(Throwable e) {
          assertTrue(e instanceof RuntimeException);
          throw new Error();
        }
      });
      try {
        throw new RuntimeException();
      } catch (Error expected) {
      }
      GWT.setUncaughtExceptionHandler(oldHandler);
    } finally {
      GWT.setUncaughtExceptionHandler(null);
    }
  }
}