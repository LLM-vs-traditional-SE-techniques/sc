import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_63 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final boolean[] uncaughtExceptionHandlerCalled = new boolean[1];
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        uncaughtExceptionHandlerCalled[0] = true;
      }
    });
    GWT.log("This should be caught");
    GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException());
    assertTrue(uncaughtExceptionHandlerCalled[0]);
  }

}