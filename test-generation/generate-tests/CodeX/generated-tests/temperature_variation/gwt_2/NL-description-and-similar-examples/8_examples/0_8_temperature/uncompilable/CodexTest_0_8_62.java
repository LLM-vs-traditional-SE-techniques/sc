import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_62 { 
  @Test
   public void testGetUncaughtExceptionHandler() {
    try {
      throw new RuntimeException();
    } catch (RuntimeException expected) {
      UncaughtExceptionHandler actual = GWT.getUncaughtExceptionHandler();
      if (actual != null) {
        actual.onUncaughtException(expected);
      }
    }
  }
}