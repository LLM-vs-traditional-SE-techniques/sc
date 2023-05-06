import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_3 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = Mockito.mock(UncaughtExceptionHandler.class);
    UncaughtExceptionHandler.setDefault(handler);
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
      Mockito.verify(handler).uncaughtException(Thread.currentThread(), e);
    }
  }
}