import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_77 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler existingExceptionHandler = GWT.getUncaughtExceptionHandler();
    final UncaughtExceptionHandler[] exceptionHandler = {null};
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        exceptionHandler[0] = this;
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    if (!GWT.isScript()) {
      assertEquals(handler, GWT.getUncaughtExceptionHandler());
      try {
        throw new Exception();
      } catch (Exception ignore) {
      }
      assertEquals(handler, exceptionHandler[0]);
    }
    GWT.setUncaughtExceptionHandler(existingExceptionHandler);
  }
*/
}