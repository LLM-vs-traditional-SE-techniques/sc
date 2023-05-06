import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_17 { 
  @Test
  public void testUncaughtExceptionHandler() {
    ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
    try {
    	//TODO: implement checking the code
    } finally {
      Thread.currentThread().setContextClassLoader(originalClassLoader);
    }
  }
}