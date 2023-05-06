import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_12 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final Exception e = new Exception();
    UncaughtExceptionHandler originalHandler = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(
          new UncaughtExceptionHandler() {
            @Override
            public void onUncaughtException(Throwable t) {
              assertSame(e, t);
            }
          });
      GWT.log("", e);
    } finally {
      GWT.setUncaughtExceptionHandler(originalHandler);
    }
  }
}