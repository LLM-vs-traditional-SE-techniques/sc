import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_4 { 
  @Test
  public void testUncaughtExceptionHandler() throws Exception {
    final Throwable t = new Throwable();
    Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        assertSame(t, getMainLooper().getThread());
        assertSame(t, Thread.currentThread());
        assertSame(e, t);
      }
    });
    getMainLooper().getThread().getUncaughtExceptionHandler().uncaughtException(
        getMainLooper().getThread(), t);
  }
}