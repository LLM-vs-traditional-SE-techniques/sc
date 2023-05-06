import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_16 { 
  @Test
    public void testGetUncaughtExceptionHandler() throws Exception {
        final List caught = new ArrayList();
        GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
          @Override public void onUncaughtException(Throwable e) {
            caught.add(e);
          }
        });
        Throwable t = new NullPointerException();
        GWT.getUncaughtExceptionHandler().onUncaughtException(t);
        assertEquals(1, caught.size());
        assertSame(t, caught.get(0));
      }
}