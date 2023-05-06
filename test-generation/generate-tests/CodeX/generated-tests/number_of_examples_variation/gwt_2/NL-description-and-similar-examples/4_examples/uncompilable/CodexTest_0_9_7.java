import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_7 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
      UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
      assertTrue("UncaughtExceptionHandler must be "+JUnitSystemUncaughtExceptionHandler.class.getName()+", but was: "+handler.getClass(), handler instanceof JUnitSystemUncaughtExceptionHandler);
    }
*/
}