import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_77 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler != null) {
      try {
        handler.onUncaughtException(new Throwable());
      } catch (Throwable e) {
        fail("GWT.getUncaughtExceptionHandler().onUncaughtException(new Throwable()) should not throw anything");
      }
    }
  }

}