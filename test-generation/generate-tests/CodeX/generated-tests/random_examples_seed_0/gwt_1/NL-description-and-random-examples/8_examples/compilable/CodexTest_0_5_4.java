import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_4 { 
  @Test
  public static void testIsClient() {
    if (com.google.gwt.core.shared.GWT.isClient()) {
      System.out.println("isClient = true");
    } else {
      System.out.println("isClient = false");
    }
  }
}