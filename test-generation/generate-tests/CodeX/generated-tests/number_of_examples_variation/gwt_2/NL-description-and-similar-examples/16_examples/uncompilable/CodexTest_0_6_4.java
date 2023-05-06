import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_4 { 
  @Test
    public void testUncaughtExceptionHandler() {
			final RuntimeException runtimeException = new RuntimeException();
			Thread.UncaughtExceptionHandler uncaughtExceptionHandler = new Thread.UncaughtExceptionHandler() {
				@Override
				public void uncaughtException(Thread thread, Throwable throwable) {
					assertEquals(runtimeException, throwable);
				}
			};
			GWT.setUncaughtExceptionHandler(uncaughtExceptionHandler);
			try {
				throw runtimeException;
			} catch (RuntimeException expected) {
				assertEquals(runtimeException, expected);
			}
			assertEquals(uncaughtExceptionHandler, GWT.getUncaughtExceptionHandler());
		}
}