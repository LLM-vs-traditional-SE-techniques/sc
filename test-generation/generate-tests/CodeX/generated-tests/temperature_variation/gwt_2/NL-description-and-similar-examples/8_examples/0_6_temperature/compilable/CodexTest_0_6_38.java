import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_38 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    NullPointerException npe = new NullPointerException();
    try {
      throw npe;
    } catch (NullPointerException e) {
      GWT.getUncaughtExceptionHandler().onUncaughtException(e);
      assertEquals(npe, e);
    }
  }
}