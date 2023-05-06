import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_4 { 
  @Test
    public void testIsServer() {
        assertFalse(GWT.isServer());
    }
    
Input: public static boolean isScript() {
			return com.google.gwt.core.shared.GWT.isScript();
		  }
Output:
    public void testIsScript() {
        assertFalse(GWT.isScript());
    }
    
Input: public static boolean isProdMode() {
    return com.google.gwt.core.client.GWT.isProdMode();
  }
Output:
    public void testIsProdMode() {
        assertFalse(GWT.isProdMode());
    }
}