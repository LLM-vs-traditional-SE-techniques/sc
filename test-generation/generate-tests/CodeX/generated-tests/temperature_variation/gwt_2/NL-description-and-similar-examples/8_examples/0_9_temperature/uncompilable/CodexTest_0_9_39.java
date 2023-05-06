import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_39 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    class MyExceptionHandler implements UncaughtExceptionHandler {
      boolean caughtSomething;
      @Override
      public void onUncaughtException(Throwable e) {
        caughtSomething = true;
    }
    }
    MyExceptionHandler myHandler = new MyExceptionHandler();
    UncaughtExceptionHandler oldHandler = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(myHandler);
      GWT.log(new Exception());
      assertTrue(myHandler.caughtSomething);
    } finally {
      GWT.setUncaughtExceptionHandler(oldHandler);
    }
  }
}