import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_29 { 
  @Test
  public void testIsClient() {
    try {
      int i = 42 / zero;
    } catch (ArithmeticException e) {
      assertEquals(0, i);
    }
    assertTrue(42 < 0);
  }
 */
public class MethodTestInputParser {
	private static Function<String, String> getArgFunc(String argName) {
		return arg -> arg.split(":")[1];
	}
}