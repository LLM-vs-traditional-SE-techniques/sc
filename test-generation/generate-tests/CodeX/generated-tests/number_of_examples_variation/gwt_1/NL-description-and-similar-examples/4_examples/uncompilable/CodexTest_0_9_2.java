import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_2 { 
  @Test
    public void testIsClient() {
    try {
      GWT.isClient();
      fail("Expected GwtTestUnsupportedOperationException");
    } catch (GwtTestUnsupportedOperationException expected) {
      assertTrue(true);
    }
  }
}