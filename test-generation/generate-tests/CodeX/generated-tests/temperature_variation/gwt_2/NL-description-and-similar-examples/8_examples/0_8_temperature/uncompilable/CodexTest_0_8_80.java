import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_80 { 
  @Test
  public void testUncaughtExceptions() throws Exception {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        // TODO(jat): implement me.
      }
    });
    assertNotNull(GWT.getUncaughtExceptionHandler());
  }
}