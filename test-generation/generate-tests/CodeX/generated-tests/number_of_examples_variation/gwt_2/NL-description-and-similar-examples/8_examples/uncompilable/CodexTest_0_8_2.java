import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_2 { 
  @Test
  public void testUncaughtExceptionHandler() {
    // faking the exception handler to manage the test
    UncaughtExceptionHandler exceptionHandler = new UncaughtExceptionHandler() {
}