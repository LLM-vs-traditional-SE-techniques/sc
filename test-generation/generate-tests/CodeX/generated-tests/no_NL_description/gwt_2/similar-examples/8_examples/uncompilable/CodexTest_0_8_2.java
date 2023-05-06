import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_2 { 
  @Test
  public void testNullUncaughtExceptionHandler() {
    Looper.prepareMainLooper();
    Looper.myLooper().setUncaughtExceptionHandler(null);
    new ConcurrentExceptionTest() {
      @Override public void runTest() throws Exception {
        throw new NullPointerException();
      }
    }.start();
    assertNull(Looper.myLooper().getUncaughtExceptionHandler());
  }
}