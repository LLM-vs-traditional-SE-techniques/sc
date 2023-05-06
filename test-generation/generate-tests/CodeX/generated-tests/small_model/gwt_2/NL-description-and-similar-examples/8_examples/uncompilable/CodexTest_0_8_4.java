import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_4 { 
  @Test
  @GwtIncompatible
public void testGetAndSetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable throwable) {
        // nothing to do
      }
    };
    UncaughtExceptionHandler oldHandler = GWT.setUncaughtExceptionHandler(handler);
    try {
      // test the new handler is set
      assertSame(handler, GWT.getUncaughtExceptionHandler());
      // check the old handler is still there
      assertSame(oldHandler, GWT.setUncaughtExceptionHandler(oldHandler));
    } finally {
      GWT.setUncaughtExceptionHandler(oldHandler);
    }
    // test setting the handler to null
    assertSame(oldHandler, GWT.setUncaughtExceptionHandler(null));
  }
}