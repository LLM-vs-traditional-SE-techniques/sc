import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_1 { 
  @Test
  public static void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = Thread.getUncaughtExceptionHandler();
    assertSame(UncaughtExceptionHandler.class, handler.getClass());
  }
}