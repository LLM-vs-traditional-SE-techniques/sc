import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_30 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final RuntimeException expected = new RuntimeException();
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertSame(expected, e);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(expected);
  }
}