import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
  @Test
   public void testCancelUncaughtExceptionHandler() {
    try {
      UncaughtExceptionHandler handler = Thread.getDefaultUncaughtExceptionHandler();
      Thread.setDefaultUncaughtExceptionHandler(mExceptionHandler);
      Thread.UncaughtExceptionHandler getter = Thread.getDefaultUncaughtExceptionHandler();
      assertSame(mExceptionHandler, getter);
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(null);
    }
  }
}