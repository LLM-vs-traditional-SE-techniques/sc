import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_48 { 
  @Test
  public void testUncaughtExceptionHandler() throws Exception {
    Throwable e = new Throwable();
    GWT.setUncaughtExceptionHandler(new Reporter(e));
    failureTest();
    fail("Expected RuntimeException");
  }
  private static void failureTest() {
    try {
      Tester.foo();
    } catch (RuntimeException re) {}
  }
  static class Reporter implements UncaughtExceptionHandler {
    private final Throwable expected;
    Reporter(Throwable expected) {
      this.expected = expected;
    }
    @Override
    public void onUncaughtException(Throwable e) {
      assertEquals(expected, e);
    }
  }

}