import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_58 { 
  @Test
  public void testUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        if (GWT.getUncaughtExceptionHandler() != null) {
          GWT.getUncaughtExceptionHandler().onUncaughtException(e);
        }
      }
    });
    GWT.setUncaughtExceptionHandler(null);
  }
}