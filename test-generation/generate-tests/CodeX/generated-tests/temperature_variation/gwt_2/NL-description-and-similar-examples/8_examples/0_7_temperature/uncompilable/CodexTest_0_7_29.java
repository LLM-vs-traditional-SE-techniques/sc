import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_29 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler h = GWT.getUncaughtExceptionHandler();
    if (h != null) {
      h.onUncaughtException(new RuntimeException());
    }
  }
}