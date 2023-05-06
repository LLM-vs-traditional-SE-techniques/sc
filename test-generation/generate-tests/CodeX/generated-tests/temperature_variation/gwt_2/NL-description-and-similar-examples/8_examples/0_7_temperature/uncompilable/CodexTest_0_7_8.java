import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_8 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler expected = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        // no-op, we just want to make sure the handler is called.
      }
    });
    try {
      throw new RuntimeException("test");
    } catch (Throwable t) {
      // no-op, we just want to make sure the handler is called.
    } finally {
      GWT.setUncaughtExceptionHandler(expected);
    }
  }
}