import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_48 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final Throwable exception = new Throwable();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertSame(exception, e);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(exception);
  }
}