import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_4 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler uncaughtExceptionHandler = GWT
        .getUncaughtExceptionHandler();
    assertEquals("com.google.gwt.core.Core.JUnit", GWT.getModuleName());
  }
}