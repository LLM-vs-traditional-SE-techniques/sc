import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_28 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
        GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
            public void onUncaughtException(Throwable e) {
                Assert.fail("test failure");
            }
        });
        Assert.assertSame(GWT.getUncaughtExceptionHandler(), GWT.getUncaughtExceptionHandler());
    }
}