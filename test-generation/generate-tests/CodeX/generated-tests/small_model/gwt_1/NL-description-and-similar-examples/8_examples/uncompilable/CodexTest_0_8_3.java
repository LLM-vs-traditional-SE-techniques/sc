import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_3 { 
  @Test
  public void testIsClient() {
    assertFalse("com.google.gwt.core.Core.JUnit" != GWT.getModuleName());
    assertTrue("com.google.gwt.core.Core.JUnit".equals(GWT.getModuleName()));
    assertTrue("com.google.gwt.core.Core.JUnit".equals(BOGUS_MATCHER.getModuleName()));
  }
}