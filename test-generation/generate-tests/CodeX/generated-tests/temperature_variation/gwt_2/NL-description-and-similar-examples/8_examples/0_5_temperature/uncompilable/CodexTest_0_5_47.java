import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_47 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final List<Throwable> uncaughtThrowables = new ArrayList<Throwable>();
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        uncaughtThrowables.add(e);
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    GWT.getUncaughtExceptionHandler().onUncaughtException(new Exception());
    assertEquals(1, uncaughtThrowables.size());
  }
}