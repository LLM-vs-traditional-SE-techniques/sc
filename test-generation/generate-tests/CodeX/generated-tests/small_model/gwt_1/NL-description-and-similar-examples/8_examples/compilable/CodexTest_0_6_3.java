import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_3 { 
  @Test
  public void testIsClient() {
    // this is a wrapper around gwt.isClient in gwt-core-shared.
    // see http://code.google.com/p/google-web-toolkit/wiki/GWT_Shared#gwt.isClient
    // for details.
    assertTrue(GWT.isClient());
  }
}