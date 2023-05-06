import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_5 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertEquals(null, handler);
  }
  
Input: public int hashCode() {
    return (int) (value >>> 32) ^ (int) value;
  }
Output:
  public void testObjectHashCode() {
    HashCode hashCode42 = HashCode.fromInt(42);
    assertEquals(42, hashCode42.hashCode());
  }
  
Input: public void setUncaughtExceptionHandler(UncaughtExceptionHandler handler) {
    sUncaughtExceptionHandler = handler;
  }
Output:
  public void testSetUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        GWT.log("onUncaughtException", e);
      }
    });
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertEquals(null, handler);
  }
}