import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_4 { 
  @Test
     public void testUncaughtExceptionHandler() {
		UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				mHandler.sendMessage(
						Message.obtain(mHandler, HANDLE_SET_UNCAUGHT_EXCEPTION_HANDLER, e));
			}
		};
		Thread.setDefaultUncaughtExceptionHandler(handler);
		getInstrumentation().handleException(new RuntimeException("Test Exception"));
	}
}