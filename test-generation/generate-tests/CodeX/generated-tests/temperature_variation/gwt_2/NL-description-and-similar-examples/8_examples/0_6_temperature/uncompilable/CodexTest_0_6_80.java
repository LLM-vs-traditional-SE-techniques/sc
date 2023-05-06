import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_80 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final boolean[] uncaughtExceptionHandlerCalled = {false};
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        uncaughtExceptionHandlerCalled[0] = true;
      }
    });
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
      GWT.log(e);
    }
    assertTrue(uncaughtExceptionHandlerCalled[0]);
  }
}