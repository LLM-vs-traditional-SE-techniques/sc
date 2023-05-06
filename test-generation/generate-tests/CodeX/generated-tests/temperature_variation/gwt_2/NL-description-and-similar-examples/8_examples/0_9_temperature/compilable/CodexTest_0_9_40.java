import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_40 { 
  @Test
  public void testUncaughtExceptionHandlerIsNotNull() {
    Assert.assertNotNull("UncaughtExceptionHandler MUST NOT be null", GWT.getUncaughtExceptionHandler());
  }

}