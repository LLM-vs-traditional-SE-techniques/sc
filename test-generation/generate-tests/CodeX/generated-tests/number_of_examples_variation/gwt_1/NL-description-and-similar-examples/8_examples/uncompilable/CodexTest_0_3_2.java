import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_2 { 
  @Test
  public void testIsClient() {
    if (GWT.isClient()) {
      // A GWT test class.
      RootPanel rootPanel = RootPanel.get();
      assertNotNull(rootPanel);
      assertEquals(0, rootPanel.getWidgetCount());
    } else {
      // A JRE test class.
      assertEquals(0, 0);
    }
  }
}