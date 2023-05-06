import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_7 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    assertEquals("com.google.gwt.core.Core.UncaughtExceptionHandler",
        GWT.getUncaughtExceptionHandler().getClass().getName());
  }
}