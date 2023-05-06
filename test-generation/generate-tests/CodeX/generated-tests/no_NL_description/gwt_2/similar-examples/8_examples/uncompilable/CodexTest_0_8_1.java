import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_1 { 
  @Test
  public void testDefaultUncaughtExceptionHandler() {
    UncaughtExceptionHandler uncaughtExceptionHandler = AsyncTask.getUncaughtExceptionHandler();
    assertNotNull(uncaughtExceptionHandler);
    assertSame(uncaughtExceptionHandler, AsyncTask.THREAD_POOL_EXECUTOR.getUncaughtExceptionHandler());
  }

}