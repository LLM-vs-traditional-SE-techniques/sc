import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_63 { 
  @Test
  public void testUncaughtExceptionHandler() {
    GWT.getUncaughtExceptionHandler().onUncaughtException(new RuntimeException());
    verify(sandBox.getMockedLogger()).log(eq(TreeLogger.ERROR), anyString());
  }
}