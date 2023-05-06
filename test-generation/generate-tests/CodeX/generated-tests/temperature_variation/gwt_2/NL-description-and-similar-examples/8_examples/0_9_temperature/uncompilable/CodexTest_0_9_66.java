import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_66 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler defaultUncaughtExceptionHandler = GWT.getUncaughtExceptionHandler();
    UncaughtExceptionHandler uncaughtExceptionHandler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertTrue(e instanceof NullPointerException);
      }
    };
    GWT.setUncaughtExceptionHandler(uncaughtExceptionHandler);
    try {
      Object o = null;
      o.toString();
    } finally {
      GWT.setUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
    }
  }
 */
public class GWTCoreTestGenerator extends PluginImpl {
}