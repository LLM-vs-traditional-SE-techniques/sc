import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_2 { 
  @Test
  public void testUncaughtExceptionHandler() {
    Thread.UncaughtExceptionHandler originalHandler = Thread.getDefaultUncaughtExceptionHandler();
    UncaughtExceptionHandler originalInternalHandler = GwtPlatform.getUncaughtExceptionHandler();
    try {
      final RuntimeException exception = new RuntimeException();
      final AtomicReference<Throwable> fallbackHandlerReference = new AtomicReference<Throwable>();
      Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
        @Override public void uncaughtException(Thread t, Throwable e) {
          fallbackHandlerReference.set(e);
        }
      });
}