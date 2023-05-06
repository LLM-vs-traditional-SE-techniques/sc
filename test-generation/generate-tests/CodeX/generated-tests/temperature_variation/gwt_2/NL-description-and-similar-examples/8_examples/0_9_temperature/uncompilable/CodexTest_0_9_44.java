import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_44 { 
  @Test
    public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler h = GWT.getUncaughtExceptionHandler();
    assertNotNull("We should have an exception handler by default.", h);
  }
}