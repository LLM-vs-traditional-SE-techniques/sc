import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_8 { 
  @Test
  public void testHandler() {
    UncaughtExceptionHandler h = CoreTest.getUncaughtExceptionHandler();
    assertNotSame(GWT.getUncaughtExceptionHandler(), h); // Fail test if getUncaughtExceptionHandler is public
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
      }
    });
    assertSame(CoreTest.getUncaughtExceptionHandler(), h);
  }
}