import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_25 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler == null) {
      handler = new UncaughtExceptionHandler() {
        public void onUncaughtException(Throwable e) {
          throw new RuntimeException(e);
        }
      };
      GWT.setUncaughtExceptionHandler(handler);
    }
  }
}