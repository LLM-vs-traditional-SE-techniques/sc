import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_61 { 
  @Test
      public void testSetUncaughtExceptionHandler() {
        UncaughtExceptionHandler h = GWT.getUncaughtExceptionHandler();
        GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
          public void onUncaughtException(Throwable e) {
            e.printStackTrace();
          }
        });
        assertNotNull(GWT.getUncaughtExceptionHandler());
        GWT.setUncaughtExceptionHandler(h);
      }
}