import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_21 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final boolean[] handlerWasCalled = { false };
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        handlerWasCalled[0] = true;
        throw new RuntimeException("dummy handler threw this");
      }
    });
    try {
      throw nullPointerFromJSNI();
    } catch (Throwable e) {
    }
    assertTrue(handlerWasCalled[0]);
  }
}