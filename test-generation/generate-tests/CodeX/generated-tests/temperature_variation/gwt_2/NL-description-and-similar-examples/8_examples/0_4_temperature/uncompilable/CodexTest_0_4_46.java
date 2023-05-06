import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_46 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final AtomicReference<Throwable> ref = new AtomicReference<>();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        ref.set(e);
      }
    });
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
      // expected
    }
    assertNotNull(ref.get());
    assertSame(ref.get(), GWT.getUncaughtExceptionHandler().getUncaughtException());
  }
}