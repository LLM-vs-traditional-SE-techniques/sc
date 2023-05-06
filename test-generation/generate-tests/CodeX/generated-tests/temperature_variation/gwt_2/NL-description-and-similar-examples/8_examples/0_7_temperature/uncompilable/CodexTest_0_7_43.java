import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_43 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler1 = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        e.printStackTrace();
      }
    };
    UncaughtExceptionHandler handler2 = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException("This is an exception");
      }
    };
    GWT.setUncaughtExceptionHandler(handler1);
    GWT.setUncaughtExceptionHandler(handler2);
    handler2.onUncaughtException(new RuntimeException("This is an exception"));
    GWT.setUncaughtExceptionHandler(null);
    handler2.onUncaughtException(new RuntimeException("This is an exception"));
  }

}