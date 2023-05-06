import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_20 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
      // test some code that can throw an uncaught exception
      GWT.getUncaughtExceptionHandler().onUncaughtException(new Exception());
  }
}