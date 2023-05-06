import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_29 { 
  @Test
  public void testDefaultUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(null);
    UncaughtExceptionHandler defaultUncaughtExceptionHandler = GWT.getUncaughtExceptionHandler();
}