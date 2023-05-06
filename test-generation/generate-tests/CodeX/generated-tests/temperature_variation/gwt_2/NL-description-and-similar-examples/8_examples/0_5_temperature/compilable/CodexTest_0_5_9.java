import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_9 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(new Throwable());
    } catch (Throwable e) {
      fail("GWT.getUncaughtExceptionHandler().onUncaughtException(new Throwable()) " + "should not throw an exception");
    }
  }
}