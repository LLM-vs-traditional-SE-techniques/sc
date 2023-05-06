import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_10 { 
  @Test
  public void testUncaughtExceptionHandler() throws InterruptedException {
    // Java 7 writes uncaught exceptions to the log.
    System.setProperty("java.util.logging.SimpleFormatter.format",
        "%4$s: %5$s [%1$tc]%n");
    try (LogVerifier verifier = new LogVerifier(
        UncaughtExceptionHandlerTest.class)) {
      UncaughtExceptionHandler ueh = new UncaughtExceptionHandler();
      Thread.setDefaultUncaughtExceptionHandler(ueh);
      Thread thread = new Thread(new UncaughtExceptionHandlerTest());
      thread.start();
      thread.join();
      assertEquals(0, thread.getUncaughtExceptionHandler().uncaughtExceptionCount());
      assertEquals(1, ueh.uncaughtExceptionCount());
      assertEquals(Thread.currentThread().getUncaughtExceptionHandler(), ueh);
      verifier.expectLogContaining("UncaughtExceptionHandlerTest", "test", "Expected exception");
    }
  }

}