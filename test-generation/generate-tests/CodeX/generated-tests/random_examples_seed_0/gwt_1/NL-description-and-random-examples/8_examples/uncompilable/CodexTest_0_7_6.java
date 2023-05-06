import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_6 { 
  @Test
  /**
   * Test method for {@link com.google.gwt.inject.client.AbstractGinModule#configure()}.
   */
  public void testConfigure() throws Exception {
    if (GWT.isClient()) {
      GinModule ginModule = Mockito.mock(GinModule.class);
      AbstractGinModule abstractGinModule = new AbstractGinModule() {
        @Override
        protected void configure() {}
      };
      abstractGinModule.configure();
      Mockito.verify(ginModule, Mockito.never()).configure(Mockito.any(Binder.class));
    }
  }
}