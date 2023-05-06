import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_30 { 
  @Test
  public void testUncaughtExceptionHandler() {
    Throwable t = new Throwable();
    try {
      throw new RuntimeException(t);
    } catch (RuntimeException e) {
      assertEquals(t.getMessage(), e.getCause().getMessage());
    }
  }
}