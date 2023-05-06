import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_60 { 
  @Test
  private static class TestUncaughtExceptionHandler implements UncaughtExceptionHandler {
    @Override
    public void onUncaughtException(Throwable e) {
    }
  }
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler orig = GWT.getUncaughtExceptionHandler();
    try {
      UncaughtExceptionHandler handler = new TestUncaughtExceptionHandler();
      GWT.setUncaughtExceptionHandler(handler);
	  assertEquals(handler, GWT.getUncaughtExceptionHandler());
    } finally {
      GWT.setUncaughtExceptionHandler(orig);
    }
  }

}