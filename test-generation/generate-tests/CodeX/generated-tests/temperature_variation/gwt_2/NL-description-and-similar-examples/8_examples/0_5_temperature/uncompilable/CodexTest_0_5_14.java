import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_14 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final RuntimeException expectedException = new RuntimeException();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEquals(expectedException, e);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(expectedException);
  }
}