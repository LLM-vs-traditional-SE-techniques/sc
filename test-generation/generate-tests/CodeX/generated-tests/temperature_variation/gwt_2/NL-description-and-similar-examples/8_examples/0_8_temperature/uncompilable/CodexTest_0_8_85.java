import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_85 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
        UncaughtExceptionHandler original = GWT.getUncaughtExceptionHandler();
        GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
          @Override
          public void onUncaughtException(Throwable e) {
            assertTrue("Should be an instance of RuntimeException", e instanceof RuntimeException);
            assertEquals("Should have the right message", 42, ((RuntimeException) e).getMessage());
          }
        });
        GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException("42"));
        GWT.setUncaughtExceptionHandler(original);
      }
}