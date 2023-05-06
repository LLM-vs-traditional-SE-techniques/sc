import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_4 { 
  @Test
  public void testUncaughtExceptions() {
    GWTTestCase test = new GWTTestCase() {
      public String getModuleName() {
        return "com.google.gwt.core.CoreTest";
      }
     :
      public void testUncaughtExceptions() {
        try {
          throw new RuntimeException();
        } catch (Exception e) {
          assertTrue(GWT.getUncaughtExceptionHandler().getClass().getName().endsWith("Exceptions"));
        }
      }
}