import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_6 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    assertNotNull(ueh);
    try {
      GWT.setUncaughtExceptionHandler(null);
      fail("expected NullPointerException");
    } catch (NullPointerException expected) {
      // pass
    }
    GWT.setUncaughtExceptionHandler(ueh);
    assertSame(ueh, GWT.getUncaughtExceptionHandler());
  }
}