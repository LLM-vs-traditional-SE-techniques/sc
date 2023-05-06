import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_9 { 
  @Test
        public static void testUncaughtExceptionHandler() {
            // verify that the default handler is set
            assertNotNull(Thread.getUncaughtExceptionHandler());
        }
}