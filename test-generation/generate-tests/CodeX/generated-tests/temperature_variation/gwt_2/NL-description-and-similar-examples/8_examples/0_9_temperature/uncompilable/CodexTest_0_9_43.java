import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_43 { 
  @Test
  public void testUncaughtExceptionHandler() throws Exception {
    for (int i = 0; i < 10; i++) {
      GWTTestCase.setUp();
      assertNotNull(GWT.getUncaughtExceptionHandler());
      GWTTestCase.tearDown();
    }
  }

}