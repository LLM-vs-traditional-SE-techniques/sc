import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_72 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler mockHandler = mock(UncaughtExceptionHandler.class);
    GWT.setUncaughtExceptionHandler(mockHandler);
    GWT.getUncaughtExceptionHandler().onUncaughtException(new Throwable());
    verify(mockHandler).onUncaughtException(any(Throwable.class));
  }
}