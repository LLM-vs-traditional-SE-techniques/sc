import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_52 { 
  @Test
  public void testUncaughtExceptionHandler() {
    // override the static handler with a mock
    final UncaughtExceptionHandler mockHandler = new UncaughtExceptionHandler() {
      @Override public void onUncaughtException(Throwable e) {
      }
    };
    GWT.setUncaughtExceptionHandler(mockHandler);
    // verify the static handler is now our mock
    assertSame(mockHandler, GWT.getUncaughtExceptionHandler());
  }
}