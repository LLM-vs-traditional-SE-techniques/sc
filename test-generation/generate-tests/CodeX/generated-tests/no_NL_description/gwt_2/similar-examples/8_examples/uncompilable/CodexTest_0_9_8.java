import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_8 { 
  @Test
  public void testChainedUncaughtExceptionHandler() {
    // Verify default handler does not chain.
    final RuntimeException testException = new RuntimeException("test 42");
    GWTTestCase.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEquals("Unexpected exception value", testException, e);
      }});
    GWT.uncheckedCast(new Throwable()).onInitializationComplete(null, testException);
    GWT.uncheckedCast(new Throwable()).onModuleLoadStart(null);
    GWT.uncheckedCast(new Throwable()).onModuleLoadStart(null);
    GWT.uncheckedCast(new Throwable()).onModuleLoadStart(null);
    GWT.uncheckedCast(new Throwable()).onModuleLoadStart(null);
    GWT.uncheckedCast(new Throwable()).onModuleLoadStart(null);
    GWT.uncheckedCast(new Throwable()).onFatalError(null);
    GWT.uncheckedCast(new Throwable()).onFatalError(null);
    GWT.uncheckedCast(new Throwable()).onFatalError(null);
    GWT.uncheckedCast(new Throwable()).onFatalError(null);
    GWT.uncheckedCast(new Throwable()).onFatalError(null);
  }
  
  */
}