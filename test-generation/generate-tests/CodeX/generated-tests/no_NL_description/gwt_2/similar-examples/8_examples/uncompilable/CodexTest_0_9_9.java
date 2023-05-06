import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_9 { 
  @Test
   public void testUncaughtExceptionsDontCrashTheProcess() {
     UncaughtExceptionHandler previous = Thread.getDefaultUncaughtExceptionHandler();
     Throwable caught = null;
     try {
       Thread.setDefaultUncaughtExceptionHandler(new NullPointerException());
       new Thread(() -> { throw new RuntimeException(); }).start();
     } catch (Throwable t) {
       caught = t;
     } finally {
       Thread.setDefaultUncaughtExceptionHandler(previous);
       assertThat(caught).isInstanceOf(RuntimeException.class);
     }
   }
}