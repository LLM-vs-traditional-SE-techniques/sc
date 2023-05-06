import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_61 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final AtomicReference<Throwable> uncaught = new AtomicReference<Throwable>();
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        uncaught.set(e);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException(test));
    assertEquals(test, uncaught.get().getMessage());
  }

}