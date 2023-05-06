import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_15 { 
  @Test
    public void testIsClient() {
        if (com.google.gwt.core.shared.GWT.isClient()) {
            fail("Expected com.google.gwt.core.shared.GWT.isClient() to return false");
        }
    }
}