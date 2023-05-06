import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_5 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    Assert.assertNotNull(ueh);
    ueh.onUncaughtException(new Throwable("test"));
  }
}