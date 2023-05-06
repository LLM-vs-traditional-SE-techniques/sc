import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_32 { 
  @Test
  public void testGetUncaughtExceptionHandlerIfSet() {
    UncaughtExceptionHandler ueh = mock(UncaughtExceptionHandler.class);
    UncaughtException.setUncaughtExceptionHandler(ueh);
    UncaughtException.caughtException(new Exception());
    verify(ueh, times(1)).uncaughtException(any());
  }
}