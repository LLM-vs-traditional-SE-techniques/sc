import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_8 { 
  @Test
  public void testUncaughtExceptionHandler() {
    Throwable e = new Exception();
    Mockito.doAnswer(new Answer() {
      @Override public Object answer(InvocationOnMock invocation) {
        Object[] args = invocation.getArguments();
        Thread t = (Thread) args[0];
        Throwable e = (Throwable) args[1];
        assertEquals(e, e);
        assertEquals(Thread.currentThread(), t);
        return null;
      }
    }).when(mockUncaughtExceptionHandler).uncaughtException(any(Thread.class), any(Throwable.class));
    Thread.setDefaultUncaughtExceptionHandler(mockUncaughtExceptionHandler);
    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
    Mockito.verify(mockUncaughtExceptionHandler, Mockito.times(1)).uncaughtException(any(Thread.class), any(Throwable.class));
  }
}