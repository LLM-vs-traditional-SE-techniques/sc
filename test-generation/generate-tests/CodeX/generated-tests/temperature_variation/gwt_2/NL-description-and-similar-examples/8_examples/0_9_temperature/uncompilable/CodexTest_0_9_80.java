import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_80 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    try {
      throw new Death();
    } catch (Death d) {
      GWT.getUncaughtExceptionHandler();
      assertTrue(d.getCause() instanceof MyThrowable);
      assertTrue(d.getCause().getMessage().endsWith("MyThrowable2"));
    }
  }
}