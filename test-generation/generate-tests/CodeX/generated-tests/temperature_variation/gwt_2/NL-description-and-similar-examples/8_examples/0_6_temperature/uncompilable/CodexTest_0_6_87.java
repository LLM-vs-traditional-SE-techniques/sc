import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_87 { 
  @Test
  private static class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {
    public void onUncaughtException(Throwable e) {
      throw new RuntimeException(e);
    }
  }
}