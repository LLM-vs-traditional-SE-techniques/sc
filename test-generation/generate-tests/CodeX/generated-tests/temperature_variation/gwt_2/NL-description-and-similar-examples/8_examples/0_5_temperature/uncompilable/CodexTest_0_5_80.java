import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_80 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final List<Throwable> uncaughtThrowables = new ArrayList<Throwable>();
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        uncaughtThrowables.add(e);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException());
    assertEquals(1, uncaughtThrowables.size());
  }
}