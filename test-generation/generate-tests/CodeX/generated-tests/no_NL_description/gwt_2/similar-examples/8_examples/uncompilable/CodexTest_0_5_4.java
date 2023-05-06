import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_4 { 
  @Test
  public void testDefaultUncaughtExceptionHandler() {
    UncaughtExceptionHandler defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
    assertTrue("The default handler should be a GWT handler",
        defaultHandler instanceof GWT.UncaughtExceptionHandler);
    assertTrue("The default handler should be the same as the GWT handler",
        defaultHandler == GWT.getUncaughtExceptionHandler());
  }
}