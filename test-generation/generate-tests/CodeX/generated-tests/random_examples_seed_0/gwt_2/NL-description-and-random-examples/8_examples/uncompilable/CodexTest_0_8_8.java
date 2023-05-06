import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_8 { 
  @Test
    public static void testGetUncaughtExceptionHandler() {
        RemoteAndroidTestRunner testRunner = new RemoteAndroidTestRunner(com.android.foo, android.test.InstrumentationTestRunner, null);
        assertFalse(testRunner.getUncaughtExceptionHandler());
    }
}