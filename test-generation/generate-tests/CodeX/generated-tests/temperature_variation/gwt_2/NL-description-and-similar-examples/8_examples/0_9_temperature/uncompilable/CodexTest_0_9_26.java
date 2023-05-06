import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_26 { 
  @Test
  private void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler wrapped = new Wrapped<UncaughtExceptionHandler>(
        GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(wrapped);
    try {
      GWTTestCase.sTestResult = null;
      new UncaughtException */
}