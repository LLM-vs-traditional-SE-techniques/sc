import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
      UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
      UncaughtExceptionHandler expected = GWT.create(UncaughtExceptionHandler.class);
      if (!GWT.isClient()) {
        assertEquals(expected.getClass(), handler.getClass());
      }
    }
}