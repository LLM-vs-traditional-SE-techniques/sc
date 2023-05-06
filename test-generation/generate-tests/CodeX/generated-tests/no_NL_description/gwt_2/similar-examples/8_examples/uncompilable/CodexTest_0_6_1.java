import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_1 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler previous = Thread.getDefaultUncaughtExceptionHandler();
    try {
      final AtomicReference<Throwable> thrown = new AtomicReference<Throwable>();
      Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
          thrown.set(e);
        }
      });
      ExceptionInInitializerError e = assertThrows(ExceptionInInitializerError.class, () -> {
        Class.forName("com.google.common.reflect.TypeToken$ClassGetter").newInstance();
      });
      assertNotNull(thrown.get());
      assertSame(e, thrown.get());
      assertSame(e.getCause(), thrown.get().getCause());
      assertSame(Throwable.class, thrown.get().getCause().getCause().getClass());
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(previous);
    }
  }
}