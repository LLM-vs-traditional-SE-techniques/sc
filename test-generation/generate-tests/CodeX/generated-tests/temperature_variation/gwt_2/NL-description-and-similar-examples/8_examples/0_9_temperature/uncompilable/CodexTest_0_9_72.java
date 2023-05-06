import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_72 { 
  @Test
    @SuppressWarnings({"deprecation"})
      public void testGetUncaughtExceptionHandler() {
        GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
          @Override
          public void onUncaughtException(Throwable e) {
            uncaughtException = e;
          }
        });
        GWT.getUncaughtExceptionHandler().onUncaughtException(
            new UnsupportedOperationException());
        assertNotNull(uncaughtException);
      }

}