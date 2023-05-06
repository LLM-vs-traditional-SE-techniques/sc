import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_7 { 
  @Test
    public void testUncaughtExceptionHandler() {
        UncaughtExceptionHandler handlerA = GWT.getUncaughtExceptionHandler();
        UncaughtExceptionHandler handlerB = GWT.getUncaughtExceptionHandler();
        String message = "GWT.getUncaughtExceptionHandler() is expected to return the same "
                        + "instance on consecutive calls.";
        assertSame(message, handlerA, handlerB);
    }
}