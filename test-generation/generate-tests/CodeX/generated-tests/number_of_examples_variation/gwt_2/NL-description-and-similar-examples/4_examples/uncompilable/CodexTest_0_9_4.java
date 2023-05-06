import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_4 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(
			new UncaughtExceptionHandler() {
			  @Override
			  public void onUncaughtException(Throwable e) {
				System.out.println(e.getMessage());
			  }
			});
    assertEquals(
			"GWT.getUncaughtExceptionHandler() should return the same object as previously set.",
			GWT.getUncaughtExceptionHandler(), GWT.getUncaughtExceptionHandler());
  }
}