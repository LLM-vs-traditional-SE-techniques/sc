import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_68 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWTTestCase.addGwtCreateHandler(new GwtCreateHandler() {
      @Override
      public void onGwtCreate(GwtCreateEvent event) {
        GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
          @Override
          public void onUncaughtException(Throwable e) {
            throw new RuntimeException(e);
          }
        });
      }
    });
    GWTTestCase.addTearDownHandler(new TearDownHandler() {
      @Override
      public void onTearDown(TearDownEvent event) {
        GWT.setUncaughtExceptionHandler(null);
      }
    });
    GWT.setUncaughtExceptionHandler(null);
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNull(handler);
  }
}