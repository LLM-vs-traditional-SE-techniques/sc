import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_10 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(null);
    GWT.getUncaughtExceptionHandler();
    Assert.assertNotNull(GWT.getUncaughtExceptionHandler());
  }
"""
    call = Call(classinfo.get_func_name(line), classinfo.get_func_args(line))
    assert_equal(output, call.get_junit_test_suggestion())
}