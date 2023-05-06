import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_4 { 
  @Test
    public void testIsClient() {
        // given
        CoreTypeDescriptor underTest = new CoreTypeDescriptor();
        // when
        Boolean result = underTest.isClient();
        // then
        assertFalse(result);
    }
}