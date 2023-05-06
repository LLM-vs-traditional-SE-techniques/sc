import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_3 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final AtomicReference<Throwable> uncaught = new AtomicReference<Throwable>();
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        uncaught.set(e);
      }
    });
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
      assertSame(e, uncaught.get());
    }
  }
}