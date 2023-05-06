import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_1 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
      try {
        if (GWT.getUncaughtExceptionHandler() == null) {
          fail("Expected non-null uncaught exception handler");
        }
      } catch (Throwable t) {
        fail("Unexpected exception: " + t.toString());
      }
    }
}