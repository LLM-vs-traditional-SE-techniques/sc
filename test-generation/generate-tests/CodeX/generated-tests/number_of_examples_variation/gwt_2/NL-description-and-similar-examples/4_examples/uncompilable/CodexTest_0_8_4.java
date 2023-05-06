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
    GWT.setUncaughtExceptionHandler(new GWTTestCase.ExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        fail("Uncaught Exception: "+ e);
      }
    });
	Assert.assertEquals(GWT.getUncaughtExceptionHandler(), GWTTestCase.ExceptionHandler);
  }
  
Input: public static boolean isProdMode() {
		  return com.google.gwt.core.shared.GWT.isProdMode();
}
Output: public void testProdMode() {
		  Assert.assertEquals(GWT.isProdMode(), false);
}
}