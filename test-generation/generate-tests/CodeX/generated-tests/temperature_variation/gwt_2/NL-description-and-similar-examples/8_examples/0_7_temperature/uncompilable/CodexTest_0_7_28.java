import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_28 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
		UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
			@Override
			public void onUncaughtException(Throwable e) {
				throw new RuntimeException("Expected");
			}
		};
		GWT.setUncaughtExceptionHandler(handler);
		assertSame(handler, GWT.getUncaughtExceptionHandler());
		GWT.setUncaughtExceptionHandler(null);
		assertNull(GWT.getUncaughtExceptionHandler());
	}
}