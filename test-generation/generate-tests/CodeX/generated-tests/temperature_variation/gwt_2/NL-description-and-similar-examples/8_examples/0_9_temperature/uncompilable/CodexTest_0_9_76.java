import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_76 { 
  @Test
  public void testDefaultUncaughtExceptionHandler() {
    UncaughtExceptionHandler eh = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(null); // reset
  
    verify(eh).onUncaughtException(isA(Throwable.class));
  }
}