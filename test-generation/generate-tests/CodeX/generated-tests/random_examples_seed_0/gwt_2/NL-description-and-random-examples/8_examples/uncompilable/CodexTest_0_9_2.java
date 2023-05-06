import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_2 { 
  @Test
  public void testGetDefaultUncaughtExceptionHandlerWithMultipleThreads() {
    assertThat(getUncaughtExceptionHandler(), is(nullValue()));
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        assertThat(getUncaughtExceptionHandler(), is(any(UncaughtExceptionHandler.class)));
      }
    });
    thread.start();
    joinThread(thread);
  }
}