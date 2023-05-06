import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_7 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final AtomicReference<Throwable> uncaughtException = new AtomicReference<Throwable>();
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        uncaughtException.set(e);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException());
    assertNotNull(uncaughtException.get());
  }
}