import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_46 { 
  @Test
  public void testRegisterUncaughtExceptionHandler() {
    GWTTestCase.UncaughtExceptionHandler handler = new GWTTestCase.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        errorMessage = e.getClass().getName();
      }
    };
}