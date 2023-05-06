import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_10 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
        assertNotNull("default handler", Log.getUncaughtExceptionHandler());
        Log.setUncaughtExceptionHandler(null);
        assertNull("null handler", Log.getUncaughtExceptionHandler());
        Log.setUncaughtExceptionHandler(sUncaughtExceptionHandler);
        assertEquals("restored handler", sUncaughtExceptionHandler, Log.getUncaughtExceptionHandler());
    }
}