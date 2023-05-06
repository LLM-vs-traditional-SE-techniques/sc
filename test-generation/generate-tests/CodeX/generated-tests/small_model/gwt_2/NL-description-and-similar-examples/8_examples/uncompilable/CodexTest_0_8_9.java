import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_9 { 
  @Test
  UncaughtExceptionHandler sUncaughtExceptionHandler = new UncaughtExceptionHandler() {
    public void onUncaughtException(Throwable e) {
      GWT.log(e.getMessage());
    }
  };
}