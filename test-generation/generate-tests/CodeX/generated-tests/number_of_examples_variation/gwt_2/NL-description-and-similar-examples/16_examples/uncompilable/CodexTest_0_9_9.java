import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_9 { 
  @Test
    UncaughtTestException.exception = new RuntimeException("exception");
    try {
      throw UncaughtTestException.exception;
    } catch (Throwable t) {
      GWT.getUncaughtExceptionHandler().onUncaughtException(t);
    }
    assertTrue("caught", UncaughtTestException.caught);
}