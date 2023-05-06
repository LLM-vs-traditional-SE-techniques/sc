import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_7 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final RuntimeException e = new RuntimeException();
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable t) {
        assertEquals(e, t);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(e);
  }
}