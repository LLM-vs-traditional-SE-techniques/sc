import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_41 { 
  @Test
    public void testUncaughtExceptionHandler() {
        GWT.setUncaughtExceptionHandler(
            new GWT.UncaughtExceptionHandler() {
              @Override
              public void onUncaughtException(Throwable e) {
                // Do nothing.
              }
            });
        assertEquals(GWT.getUncaughtExceptionHandler(), GWT.getUncaughtExceptionHandler());
      }
}