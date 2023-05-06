import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_10 { 
  @Test
    public static void testUncaughtExceptionHandler() {
        try {
            GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                @Override
                public void onUncaughtException(Throwable e) {
                    throw new AssertionError(e);
                }
            });
            throw new Exception();
        } catch (AssertionError e) {
            // expected
        }
        try {
            GWT.setUncaughtExceptionHandler(null);
            throw new Exception();
        } catch (Exception e) {
            // expected
        }
    }
}