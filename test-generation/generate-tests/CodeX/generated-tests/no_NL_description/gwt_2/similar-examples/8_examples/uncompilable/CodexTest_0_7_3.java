import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_3 { 
  @Test
  public void testUncaughtExceptionHandler() {
      UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
          @Override
          public void uncaughtException(Thread t, Throwable e) {
              mCaughtException = true;
              mUncaught = e;
          }
      };
      Thread.setDefaultUncaughtExceptionHandler(handler);
      new Thread(new Runnable() {
          @Override
          public void run() {
              throw new RuntimeException("test exception");
          }
      }).start();
}