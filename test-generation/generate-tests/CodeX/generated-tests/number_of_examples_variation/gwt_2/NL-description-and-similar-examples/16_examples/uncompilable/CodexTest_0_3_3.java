import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_3 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final RuntimeException expected = new RuntimeException();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertSame(expected, e);
      }
    });
    try {
      throw expected;
    } catch (RuntimeException e) {
      GWT.getUncaughtExceptionHandler().onUncaughtException(e);
    }
  }
}