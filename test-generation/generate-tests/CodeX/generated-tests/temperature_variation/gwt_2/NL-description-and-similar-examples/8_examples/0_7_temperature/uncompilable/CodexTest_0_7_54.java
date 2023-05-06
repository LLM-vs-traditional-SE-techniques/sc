import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_54 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler h = GWT.getUncaughtExceptionHandler();
    assertNotNull(h);
    GWT.setUncaughtExceptionHandler(null);
    try {
      GWT.getUncaughtExceptionHandler().onUncaughtException(
          new Throwable());
      fail();
    } catch (UnsupportedOperationException ex) {
      // expected
    } finally {
      GWT.setUncaughtExceptionHandler(h);
    }
  }
  
Input: public final int getRadius() {
    return m_Radius;
  }
Output: public void testRadiusAccess() {
    int radius = 2;
    Circle c = new Circle(radius);
    assertEquals("Radius differs", radius, c.getRadius());
  }
  
Input: public static <T, U> U[] copyOf(U[] original, int newLength, Class<? extends U[]> newType) {
    return Arrays.copyOf(original, newLength, newType);
  }
Output: public void testCopyOf() {
    Integer[] array = {1, 2, 3};
    Integer[] newArray = ArrayUtils.copyOf(array, 5);
    assertEquals(5, newArray.length);
    assertEquals(1, (int) newArray[0]);
    assertEquals(2, (int) newArray[1]);
    assertEquals(3, (int) newArray[2]);
    assertEquals(null, newArray[3]);
    assertEquals(null, newArray[4]);
  }
}