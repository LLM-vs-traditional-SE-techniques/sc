import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_40 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final ArrayList<Throwable> uncaught = new ArrayList<Throwable>();
    Thread.UncaughtExceptionHandler testHandler = new Thread.UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        uncaught.add(e);
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(testHandler);
    UncaughtExceptionHandler old = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(testHandler);
      GWT.log("test");
      assertTrue(uncaught.size() > 0);
    } finally {
      GWT.setUncaughtExceptionHandler(old);
      Thread.setDefaultUncaughtExceptionHandler(null);
    }
  }
}
}