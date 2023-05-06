import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_8 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    assertSame(Throwable.class.getDeclaredField("detailMessage").getType(),
               sUncaughtExceptionHandler.getClass().getSuperclass());
  }
}