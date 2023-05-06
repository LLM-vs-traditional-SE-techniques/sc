import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_31 { 
  @Test
  public void testUncaughtExceptionHandler() throws Throwable {
    final Throwable exception = new Throwable();
    Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        assertEquals(exception, e);
      }
    });
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        assertEquals(exception, e);
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(exception);
  }
		  
Input:  public static boolean isClient() {
    return isScript() && !isProdMode();
  }
Output: public void testClient() {
    if (GWT.isProdMode()) {
      assertFalse(GWT.isClient());
    } else {
      assertTrue(GWT.isClient());
    }
  }
}