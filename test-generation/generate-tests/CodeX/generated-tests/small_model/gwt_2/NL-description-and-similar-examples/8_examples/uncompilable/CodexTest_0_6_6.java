import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_6 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        public void onUncaughtException(Throwable e) {
          GWT.log("UncaughtException", e);
        }
      });
      GWT.setUncaughtExceptionHandler(null);
      assertEquals("com.google.gwt.core.Core.UncaughtExceptionHandler",
          GWT.getUncaughtExceptionHandler().getClass().getName());
    }
}