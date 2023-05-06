import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_37 { 
  @Test
  public void testIsClient() {
    if (GWT.isClient()) {
      Window.alert("isClient");
    } else {
      // not really doing anything in server-side mode.
    }
  }
 
Input: 
    public boolean isClient() {
        return false;
    }
Output: 
  public void testIsClient() {
      if (isClient()) {
          Window.alert("isClient");
      } else {
          // not really doing anything in server-side mode.
      }
  }
}