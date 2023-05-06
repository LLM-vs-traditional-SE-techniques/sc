import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_69 { 
  @Test
  public void testUncaughtExceptionHandler() {
    try {
      RuntimeException e = new RuntimeException(test);
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        public void onUncaughtException(Throwable e) {
          throw e;
        }
      });
      throw e;
    } catch (RuntimeException e) {
      assertEquals(test, e.getMessage());
    }
  }
}