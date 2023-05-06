import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_74 { 
  @Test
  public void testUncaughtExceptionHandler() {
        try {
            GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException("test"));
            fail("Expected an exception");
        } catch (Exception expected) {
            assertEquals("Execution failed with an uncaught exception", expected.getMessage());
            assertEquals("test", expected.getCause().getMessage());
        }
    }
    */
}