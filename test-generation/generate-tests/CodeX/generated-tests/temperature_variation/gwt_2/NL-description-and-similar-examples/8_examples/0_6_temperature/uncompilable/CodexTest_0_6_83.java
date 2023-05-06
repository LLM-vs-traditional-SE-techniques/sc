import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_83 { 
  @Test
  public void testUncaughtExceptionHandler() {
    Throwable e = new Throwable();
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEquals(e, GWT.getUncaughtExceptionHandler().onUncaughtException(e));
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(e);
  }
}