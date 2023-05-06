import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  @Test
        public void testGetUncaughtExceptionHandler() {
            try {
                GWT.getUncaughtExceptionHandler().onUncaughtException(new Exception("Uncaught"));
                GWT.getUncaughtExceptionHandler().onUncaughtException(new UncaughtException("Uncaught"));
                GWT.getUncaughtExceptionHandler().onUncaughtException(null);
            } catch (Exception e) {
                fail(e.getMessage());
            }
        }
}