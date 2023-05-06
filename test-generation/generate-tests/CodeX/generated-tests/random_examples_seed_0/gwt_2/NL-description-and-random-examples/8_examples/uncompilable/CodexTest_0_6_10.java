import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_10 { 
  @Test
  public void testUncaughtExceptionHandler() throws Exception {
    UncaughtExceptionHandler defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
    Thread.setDefaultUncaughtExceptionHandler(null);
    try {
      assertNull(Thread.getDefaultUncaughtExceptionHandler());
      assertNull(Thread.getUncaughtExceptionHandler());
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(defaultHandler);
    }
  }

}