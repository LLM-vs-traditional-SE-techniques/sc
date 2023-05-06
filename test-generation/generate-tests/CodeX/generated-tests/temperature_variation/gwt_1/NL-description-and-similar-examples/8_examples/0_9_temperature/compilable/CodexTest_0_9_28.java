import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_28 { 
  @Test
    public void testIsClient() {
        if (GWT.isClient()) {
            try {
                int i = 5 / 0;
            } catch (ArithmeticException e) {
                assertTrue(GWT.isClient());
            }
        }
    }
}