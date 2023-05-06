import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_6 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final List<Throwable> uncaughtExceptions = new ArrayList<Throwable>();
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        uncaughtExceptions.add(e);
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException());
    assertEquals(1, uncaughtExceptions.size());
    GWT.setUncaughtExceptionHandler(null);
    GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException());
    assertEquals(1, uncaughtExceptions.size());
  }
}