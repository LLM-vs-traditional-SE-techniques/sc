import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_23 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
		UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
		try {
			GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
				@Override
				public void onUncaughtException(Throwable e) {
					throw new RuntimeException(e);
				}
			});
			boolean exceptionThrown = false;
			try {
				throw new RuntimeException();
			} catch (RuntimeException e) {
				exceptionThrown = true;
			}
			assertTrue(exceptionThrown);
		} finally {
			GWT.setUncaughtExceptionHandler(handler);
		}
	}
}