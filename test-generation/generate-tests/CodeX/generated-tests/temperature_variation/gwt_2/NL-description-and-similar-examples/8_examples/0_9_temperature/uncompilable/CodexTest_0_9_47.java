import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_47 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
      GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
        @Override
        public void onUncaughtException(Throwable e) {
          handleException(e);
        }
      });
      GWT.getUncaughtExceptionHandler();
  }
*/
}
}