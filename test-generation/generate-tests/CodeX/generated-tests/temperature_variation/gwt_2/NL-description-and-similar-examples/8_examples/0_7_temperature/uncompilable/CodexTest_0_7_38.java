import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_38 { 
  @Test
  public void testUncaughtExceptionHandler() throws Exception {
    final RuntimeException testException = new RuntimeException();
    final CountDownLatch latch = new CountDownLatch(1);
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEquals(testException, e);
        latch.countDown();
      }
    });
    try {
      throw testException;
    } catch (RuntimeException e) {
      GWT.getUncaughtExceptionHandler().onUncaughtException(e);
    }
    latch.await(1, TimeUnit.SECONDS);
  }
}