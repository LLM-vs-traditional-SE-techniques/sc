import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_41 { 
  @Test
  public void testScriptsClientAndScript4() {
    Assert.assertTrue(com.google.gwt.core.client.GWT.getScriptBaseURL().length() <= 5);
    Assert.assertTrue(GWT.isClient());
    Assert.assertFalse(GWT.isScript());
  }
}