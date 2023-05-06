import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_31 { 
  @Test
  public void testIsClient() {
    if ("true".equals(true)) {
      assertTrue(GWT.isClient());
    } else {
      assertFalse(GWT.isClient());
    }
  }
}