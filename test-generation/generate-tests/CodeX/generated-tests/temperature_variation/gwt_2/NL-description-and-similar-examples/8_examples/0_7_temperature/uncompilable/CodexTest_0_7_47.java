import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_47 { 
  @Test
  public void testUncaughtExceptionHandler() throws Throwable {
    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    Throwable t = new Throwable();
    try {
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable throwable) {
          throw throwable;
        }
      });
      throw t;
    } catch (Throwable throwable) {
      if (throwable != t) {
        throw throwable;
      }
    } finally {
      GWT.setUncaughtExceptionHandler(ueh);
    }
  }
}