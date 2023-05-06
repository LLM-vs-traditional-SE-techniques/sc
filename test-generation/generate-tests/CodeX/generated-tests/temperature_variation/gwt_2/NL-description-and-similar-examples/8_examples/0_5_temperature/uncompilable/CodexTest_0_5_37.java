import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_37 { 
  @Test
  public void testUncaughtExceptionHandler() {
    try {
      GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
          throw new RuntimeException(e);
        }
      });
      throw new RuntimeException();
    } catch (RuntimeException e) {
      assertEquals(RuntimeException.class, e.getCause().getClass());
    }
}