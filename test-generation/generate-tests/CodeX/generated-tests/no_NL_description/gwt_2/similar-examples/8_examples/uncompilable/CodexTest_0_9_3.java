import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_3 { 
  @Test
  public void testGetUncaughtExceptionHandler()throws Throwable {
    UncaughtExceptionHandler ueh = GWTTestCase.getUncaughtExceptionHandler();
    final Throwable[] caught = new Throwable[1];
    ueh.uncaughtException(Thread.currentThread(), new Exception());
    assertNotNull(caught[0]);
    assertTrue(caught[0].getMessage().equals(
        "Exception thrown in JUnit test in a different thread than the test thread - "
            + "see cause for details"));
  }
}