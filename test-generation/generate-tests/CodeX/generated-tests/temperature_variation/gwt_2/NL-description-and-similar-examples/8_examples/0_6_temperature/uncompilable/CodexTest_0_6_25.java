import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_25 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
		UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
		if (handler == null) {
			GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
				@Override
				public void onUncaughtException(Throwable e) {
					GWT.log("Uncaught exception in GWT test case", e);
				}
			});
		}
	}
}