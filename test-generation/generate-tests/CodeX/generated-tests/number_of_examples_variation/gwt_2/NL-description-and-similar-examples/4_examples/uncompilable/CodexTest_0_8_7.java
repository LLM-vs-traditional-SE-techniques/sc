import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_7 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.UncaughtExceptionHandler ueh = GWT.getUncaughtExceptionHandler();
    assertNotNull(ueh);
    try {
      throw new Error("test");
    } catch (Error expected) {
      assertNull(GWT.getUncaughtExceptionHandler());
    }
  }
*/
public class GWTCommandGenerator extends CommandGenerator {
}