import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_92 { 
  @Test
  public void testUncaughtExceptionHandler() {
    Throwable e = new Exception();
    GWT.setUncaughtExceptionHandler(exception -> {
      assertEquals(e, exception);
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(e);
  }
}