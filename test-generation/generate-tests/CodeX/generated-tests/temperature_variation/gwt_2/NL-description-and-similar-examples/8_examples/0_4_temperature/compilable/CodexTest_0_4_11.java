import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_11 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final RuntimeException exception = new RuntimeException();
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        assertSame(exception, e);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(exception);
  }
}