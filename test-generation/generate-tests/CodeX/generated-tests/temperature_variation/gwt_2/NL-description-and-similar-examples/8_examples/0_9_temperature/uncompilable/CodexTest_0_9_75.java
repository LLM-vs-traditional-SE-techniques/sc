import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_75 { 
  @Test
  public void testUncaughtExceptionHandler() {
		UncaughtExceptionHandler ueh1 = new UncaughtExceptionHandler() {
			public void onUncaughtException(Throwable t) {
			}
		};
		UncaughtExceptionHandler ueh2 = new UncaughtExceptionHandler() {
			public void onUncaughtException(Throwable t) {
			}
		};
		GWT.setUncaughtExceptionHandler(ueh1);
		assertEquals(ueh1, GWT.getUncaughtExceptionHandler());
		GWT.setUncaughtExceptionHandler(ueh2);
		assertEquals(ueh2, GWT.getUncaughtExceptionHandler());
	  }
}