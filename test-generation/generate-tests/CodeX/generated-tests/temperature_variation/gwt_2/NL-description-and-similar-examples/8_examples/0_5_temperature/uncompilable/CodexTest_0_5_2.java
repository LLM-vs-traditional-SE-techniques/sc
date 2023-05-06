import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_2 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler errorHandler = GWT.getUncaughtExceptionHandler();
    assertNotNull(errorHandler);
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
      errorHandler.onUncaughtException(e);
    }
  }
}