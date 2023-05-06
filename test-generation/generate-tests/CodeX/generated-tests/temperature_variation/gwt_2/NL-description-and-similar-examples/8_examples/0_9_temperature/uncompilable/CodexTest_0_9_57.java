import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_57 { 
  @Test
  public void testSideEffectOfGWTGetUncaughtExceptionHandler() {
    String key = "foo";
    String value = "bar";
    sUncaughtExceptionHandler.handle(key, value);
    assertEquals(value, sUncaughtExceptionHandler.get(key));
  }
}