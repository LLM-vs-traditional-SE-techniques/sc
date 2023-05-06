import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  @Test
  public void testGetUncaughtExceptionHandler() throws Throwable {
		final RuntimeException exception = new RuntimeException();
		GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
			public void onUncaughtException(Throwable e) {
				if (GWT.getUncaughtExceptionHandler() instanceof GWT.UncaughtExceptionHandler) {
					assertEquals(exception, e);
				}
			}
		});
		try {
			throw exception;
		} catch (RuntimeException e) {
			GWT.setUncaughtExceptionHandler(null);
		}
	}
}