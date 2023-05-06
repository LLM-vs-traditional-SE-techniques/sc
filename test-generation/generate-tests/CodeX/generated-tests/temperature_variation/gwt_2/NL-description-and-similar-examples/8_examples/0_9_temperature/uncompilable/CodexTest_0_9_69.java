import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_69 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler oldDefault = UncaughtExceptionHandler.get();
    UncaughtExceptionHandler myHandler = new UncaughtExceptionHandler();
    try {
      UncaughtExceptionHandler.setDefault(myHandler);
      assertSame("should have returned right handler", myHandler, UncaughtExceptionHandler.get());
    } finally {
      UncaughtExceptionHandler.setDefault(oldDefault);
    }
  }
}