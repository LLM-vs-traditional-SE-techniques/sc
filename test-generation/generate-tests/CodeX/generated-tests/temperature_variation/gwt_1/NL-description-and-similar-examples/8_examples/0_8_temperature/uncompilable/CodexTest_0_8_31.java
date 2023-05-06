import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_31 { 
  @Test
  public void testIsClient() {
    String s = System.getProperty(java.version);
    assertEquals(Double.valueOf(s).doubleValue()>1.6+0.01, GWT.isClient());
  }
}