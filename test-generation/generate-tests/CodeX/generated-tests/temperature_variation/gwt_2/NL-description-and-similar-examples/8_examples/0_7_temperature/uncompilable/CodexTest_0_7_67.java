import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_67 { 
  @Test
  public void testUncaughtException() {
    Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        throw new RuntimeException(e);
      }
    });
    try {
      GWT.create(Object.class);
      fail("expected exception");
    } catch (RuntimeException expected) {
    }
  }
}