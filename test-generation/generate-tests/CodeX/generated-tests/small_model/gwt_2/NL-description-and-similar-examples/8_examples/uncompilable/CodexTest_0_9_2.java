import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_2 { 
  @Test
  public void testUncaughtExceptionHandlerGetter() {
    GwtTestCase gttc = new GwtTestCase() {
    };
    UncaughtExceptionHandler actual = gttc.getUncaughtExceptionHandler();
    boolean actualIsNull = actual == null;
    assertFalse("getUncaughtExceptionHandler returns null", actualIsNull);
  }
}