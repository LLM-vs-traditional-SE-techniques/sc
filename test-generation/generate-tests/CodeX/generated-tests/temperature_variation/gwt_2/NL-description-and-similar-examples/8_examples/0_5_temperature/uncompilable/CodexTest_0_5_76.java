import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_76 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final AtomicReference<Throwable> caught = new AtomicReference<Throwable>();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        caught.set(e);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException("test"));
    assertEquals("test", caught.get().getMessage());
  }
}