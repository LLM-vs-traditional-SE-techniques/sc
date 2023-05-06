import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_5 { 
  @Test
  public void testClient() {
    assertTrue(isClient());
  }
Input: public static boolean isServer() {
    return !com.google.gwt.core.shared.GWT.isClient();
  }
Output:
  public void testServer() {
    assertFalse(isServer());
  }
Input: public static boolean isProdMode() {
    return com.google.gwt.core.shared.GWT.isProdMode();
  }
Output:
  public void testProdMode() {
    assertFalse(isProdMode());
  }
Input: public static boolean isDebugMode() {
    return com.google.gwt.core.shared.GWT.isDebugMode();
  }
Output:
  public void testDebugMode() {
    assertTrue(isDebugMode());
  }
}
}