import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_81 { 
  @Test
  public void testUncaughtExceptionHandler() {
    String error = "Exception in thread \"main\" java.lang.UnsupportedOperationException";
    StringWriter errors = new StringWriter();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        e.printStackTrace(new PrintWriter(errors));
      }
    });
    GWT.getUncaughtExceptionHandler().onUncaughtException(new UnsupportedOperationException());
    assertTrue(errors.toString().contains(error));
  }
*/
}