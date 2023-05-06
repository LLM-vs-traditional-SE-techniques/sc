import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_7 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final UncaughtExceptionHandler[] uncaughtExceptionHandler = new UncaughtExceptionHandler[1];
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override public void onUncaughtException(Throwable e) {
        uncaughtExceptionHandler[0] = e;
      }
    });
    GWT.log("test");
    assertEquals("test", uncaughtExceptionHandler[0].getMessage());
  }
*/
}