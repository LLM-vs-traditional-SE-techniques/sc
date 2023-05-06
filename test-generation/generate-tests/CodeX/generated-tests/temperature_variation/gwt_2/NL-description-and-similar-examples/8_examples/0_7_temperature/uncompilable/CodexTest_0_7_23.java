import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_23 { 
  @Test
  public void testUncaughtExceptionHandlerIsSet() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        Assert.assertEquals(THROWABLE, e);
      }
    });
    Throwable throwable = new Throwable();
    GWT.getUncaughtExceptionHandler().onUncaughtException(throwable);
  }
}