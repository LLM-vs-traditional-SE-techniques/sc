import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_3 { 
  @Test
  public void testUncaughtExceptionHandler() {
    try {
      int i = 7 / 0;
      fail();
    } catch (ArithmeticException e) {
      // test passes
    }
  }
}