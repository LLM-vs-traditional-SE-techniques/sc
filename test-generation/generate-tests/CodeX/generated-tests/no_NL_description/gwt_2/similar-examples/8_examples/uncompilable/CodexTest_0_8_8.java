import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_8 { 
  @Test
  /**
   * Test for {@link Log#getUncaughtExceptionHandler()}
   */
  @SmallTest
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
      }
    };
    Log.setUncaughtExceptionHandler(handler);
    assertSame("Handler not set", handler, Log.getUncaughtExceptionHandler());
  }
}