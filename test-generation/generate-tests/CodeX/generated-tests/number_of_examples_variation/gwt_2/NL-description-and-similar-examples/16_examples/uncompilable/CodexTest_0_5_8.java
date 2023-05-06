import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_8 { 
  @Test
    public void testDefaultUncaughtExceptionHandler() {
        UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
        assertNotNull(handler);
        assertTrue(handler instanceof GWT.UncaughtExceptionHandler);
    }
}