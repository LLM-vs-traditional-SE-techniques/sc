import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_79 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final Throwable expectedException = new Throwable();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        assertEquals(expectedException, e);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(expectedException);
  }
}