import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_66 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    assertSame(GWTTestCase.class, GWT.getUncaughtExceptionHandler().getClass());
  }
}