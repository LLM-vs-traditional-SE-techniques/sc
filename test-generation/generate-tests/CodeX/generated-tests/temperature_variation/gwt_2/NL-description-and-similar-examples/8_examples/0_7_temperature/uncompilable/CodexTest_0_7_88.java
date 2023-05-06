import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_88 { 
  @Test
  public void testUncaughtExceptionHandler() {
    try {
      UncaughtExceptionHandler original = GWT.getUncaughtExceptionHandler();
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        public void onUncaughtException(Throwable e) {
          throw new RuntimeException("failure");
        }
      });
      try {
        throw new Exception();
      } catch (Exception e) {
        // expected
      }
      GWT.setUncaughtExceptionHandler(original);
      try {
        throw new Exception();
      } catch (Exception e) {
        // expected
      }
    } catch (RuntimeException e) {
      fail("Unexpected RuntimeException");
    }
  }

}