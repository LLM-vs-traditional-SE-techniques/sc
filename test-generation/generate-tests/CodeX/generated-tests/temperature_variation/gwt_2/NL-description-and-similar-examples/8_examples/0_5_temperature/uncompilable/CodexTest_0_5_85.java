import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_85 { 
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
    try {
      throw new RuntimeException("Expected");
    } catch (RuntimeException expected) {
      // expected
    }
    GWT.setUncaughtExceptionHandler(null);
    assertEquals(1, uncaughtExceptions.size());
    assertEquals("Expected", uncaughtExceptions.get(0).getMessage());
  }
}