import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_75 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final RuntimeException x = new RuntimeException();
    GWT.setUncaughtExceptionHandler(new ExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        Assert.assertSame(e, x);
        GWT.setUncaughtExceptionHandler(null);
      }
    });
    GWT.uncaughtException(x);
  }
}