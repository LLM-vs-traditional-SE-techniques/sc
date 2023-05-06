import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_71 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        synchronized (this) {
          notifyAll();
        }
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    try {
      ArrayList<String> list = new ArrayList<String>();
      list.get(1);
    } catch (IndexOutOfBoundsException e) {
    }
    GWT.setUncaughtExceptionHandler(null);
  }
}