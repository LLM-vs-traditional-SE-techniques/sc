import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_8 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = UncaughtExceptionHandler.class.cast(GWT.create(UncaughtExceptionHandler.class));
    assertEquals(handler, GWT.getUncaughtExceptionHandler());
  }
}