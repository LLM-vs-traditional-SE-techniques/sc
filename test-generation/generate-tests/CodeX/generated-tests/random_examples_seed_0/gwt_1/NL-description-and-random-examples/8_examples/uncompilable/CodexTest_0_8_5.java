import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_5 { 
  @Test
   public static void testNumberOfFragment() {
    final String msg = "Fragments: ";
    Assert.assertEquals(msg, 5, _.getNumberOfFragment(5));
    Assert.assertEquals(msg, 10, _.getNumberOfFragment(10));
    Assert.assertEquals(msg, 20, _.getNumberOfFragment(20));
  }
}