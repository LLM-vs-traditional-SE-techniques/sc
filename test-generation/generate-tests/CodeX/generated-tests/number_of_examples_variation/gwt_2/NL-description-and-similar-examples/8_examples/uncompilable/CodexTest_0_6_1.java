import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_1 { 
  @Test
  public void testUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        caught = e;
      }
    });
    try {
      throw new RuntimeException("intentional");
    } catch (RuntimeException e) {
      //NOOP
    }
    GWT.getUncaughtExceptionHandler().onUncaughtException(new NullPointerException("intentional"));
    assertNotNull(caught);
    assertEquals("intentional", caught.getMessage());
  }
}