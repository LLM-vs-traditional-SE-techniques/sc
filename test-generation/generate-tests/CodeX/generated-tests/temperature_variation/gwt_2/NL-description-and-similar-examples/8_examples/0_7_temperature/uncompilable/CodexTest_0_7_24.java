import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_24 { 
  @Test
  public void testGetUncaughtExceptionHandler_getIsSet() throws Exception {
    // Setup
    UncaughtExceptionHandler expectedHandler = mock(UncaughtExceptionHandler.class);
    GWT.setUncaughtExceptionHandler(expectedHandler);
    // Exercise
    UncaughtExceptionHandler actualHandler = GWT.getUncaughtExceptionHandler();
    // Verify
    assertThat(actualHandler).isSameAs(expectedHandler);
  }
}