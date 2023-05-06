import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_44 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    // NOTE: the API requires that this method never return null, so if we
    // ever violate that contract, then this test will fail.
    UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    assertNotNull(ueh);
    assertSame(GWT.getUncaughtExceptionHandler(), ueh);
  }
}