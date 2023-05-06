import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_88 { 
  @Test(expected = ArithmeticException.class)
	public void testUncaughtExceptionHandler() {
		GWT.setUncaughtExceptionHandler(null);
		double d = seven / zero;
	}
}