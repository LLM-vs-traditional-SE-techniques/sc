import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_10 { 
  @Test
  /**
   * Suggest a test for a method with the signature
   * {@link UncaughtExceptionHandler#getUncaughtExceptionHandler()}.
   */
  public void testGetUncaughtExceptionHandler() {
    GWTTestCase.assertNotNull(GWT.getUncaughtExceptionHandler());
  }
}