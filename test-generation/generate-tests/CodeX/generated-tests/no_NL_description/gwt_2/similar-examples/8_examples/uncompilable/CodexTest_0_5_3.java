import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_3 { 
  @Test
  public void testDefaultUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = Thread.getDefaultUncaughtExceptionHandler();
    assertNotNull(handler);
    handler.uncaughtException(Thread.currentThread(), new RuntimeException());
  }
}