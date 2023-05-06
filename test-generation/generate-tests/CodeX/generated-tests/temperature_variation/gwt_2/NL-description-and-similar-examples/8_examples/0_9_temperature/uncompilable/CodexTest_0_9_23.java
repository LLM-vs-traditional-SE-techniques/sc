import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_23 { 
  @Test
    public void testCaughtExceptions() {
  // "catch" and throw another exception
  try {
    ExceptionCauseAction.doThrow(ExceptionCauseAction.Cause.NUMBER_FORMAT);
    fail("exception not thrown!");
  } catch (NumberFormatException e) {
    // thrown exception should match
    assertEquals("class name matches", e.getClass().getName(),
        NumberFormatException.class.getName());
    assertEquals("message matches",
        "For input string: \"" + ExceptionCauseAction.BAD_INT_STRING + "\"",
        e.getMessage());
  }
}
}