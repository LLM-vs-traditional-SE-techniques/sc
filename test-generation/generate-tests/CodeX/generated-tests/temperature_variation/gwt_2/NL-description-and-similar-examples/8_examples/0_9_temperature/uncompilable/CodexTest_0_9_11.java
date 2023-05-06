import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_11 { 
  @Test
  public void testUncaughtExceptionHandlerNoMessage() {
    Thread.UncaughtExceptionHandler noMessage = (thread, exception) -> {
  			exception.printStackTrace();
  			fail("Did not receive expected exception message");
		  };
}