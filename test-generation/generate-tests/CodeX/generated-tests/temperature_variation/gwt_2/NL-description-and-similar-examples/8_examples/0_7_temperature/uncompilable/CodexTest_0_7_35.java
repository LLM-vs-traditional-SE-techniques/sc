import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_35 { 
  @Test
  public void testUncaughtExceptions() {
    class TestExceptionHandler implements UncaughtExceptionHandler {
      volatile Throwable caught;
      @Override
      public void onUncaughtException(Throwable e) {
        caught = e;
      }
    }
    TestExceptionHandler testExceptionHandler = new TestExceptionHandler();
    GWT.setUncaughtExceptionHandler(testExceptionHandler);
}