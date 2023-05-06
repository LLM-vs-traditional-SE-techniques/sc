import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_30 { 
  @Test
    public void testIsClient() {
        com.google.gwt.dom.client.AnchorElement e = Document.get().createAnchorElement();
        assertTrue(e instanceof com.google.gwt.dom.client.Element);
    }

}