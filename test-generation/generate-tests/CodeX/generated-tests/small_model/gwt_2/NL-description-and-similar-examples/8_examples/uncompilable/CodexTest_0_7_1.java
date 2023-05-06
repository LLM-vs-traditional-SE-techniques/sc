import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_1 { 
  @Test
    public void testUncaughtExceptionHandler() {
      Throwable t = new Throwable();
      UncaughtExceptionHandler oldHandler = GWT.getUncaughtExceptionHandler();
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        public void onUncaughtException(Throwable t) {
          fail("Should not be called");
        }
      });
      GWT.getUncaughtExceptionHandler().onUncaughtException(t);
      GWT.setUncaughtExceptionHandler(oldHandler);
    }
}