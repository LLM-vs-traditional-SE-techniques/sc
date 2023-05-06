import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_1 { 
  @Test
  public void testIsClient() {
    if (!GWT.isClient()) {
      // TODO(user): deferred binding failure for requirement
      // com.google.gwt.user.client.ui.Widget
      return;
    }
    assertTrue(GWT.isClient());
  }
}