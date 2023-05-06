import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_3 { 
  @Test
  public void testUncaughtExceptionHandler() {
    // Set up a handler
    final boolean[] handlerCalled = new boolean[1];
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void handleException(Throwable e) {
        handlerCalled[0] = true;
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
}