import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_35 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler h = GWT.getUncaughtExceptionHandler();
    assertTrue("Null handler", h != null);
  }
}