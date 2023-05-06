import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_7 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final RuntimeException re = new RuntimeException();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable t) {
        assertSame(re, t);
      }
    });
    try {
      throw re;
    } catch (RuntimeException e) {
      assertSame(re, e);
    }
  }
}