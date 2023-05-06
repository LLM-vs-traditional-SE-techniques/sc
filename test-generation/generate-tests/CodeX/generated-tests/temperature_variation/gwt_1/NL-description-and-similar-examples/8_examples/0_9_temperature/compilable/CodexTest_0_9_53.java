import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_53 { 
  @Test
   public void testIsClient() {
	  try {
		assertFalse(GWT.isClient());
		Class.forName("java.lang.Object");
		fail("Class.forName should throw an ClassNotFoundException here");
	  } catch (ClassNotFoundException e) {
		//expected
	  }
	}
}