import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_30 { 
    @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler o_testGetUncaughtExceptionHandler__1 = GWT.getUncaughtExceptionHandler();
    assertEquals(null, ((Object)o_testGetUncaughtExceptionHandler__1));
  }
*/
public class MethodSignatureToJUnitTestMethod {
	
	private static final String[] ignoredMethods = {"getProperty", "getLogger", "getEffectiveLoggerName", "isLoggable", "log", "log(Level)", "log(Level, String)"};
}