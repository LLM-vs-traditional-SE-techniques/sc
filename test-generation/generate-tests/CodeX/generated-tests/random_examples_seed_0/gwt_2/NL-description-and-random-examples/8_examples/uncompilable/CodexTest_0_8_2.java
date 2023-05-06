import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_2 { 
  @Test
    public void testUncaughtExceptionHandlerDefinedBySystemProperty() throws Exception {
      System.setProperty(KieSession.UNCAUGHT_EXCEPTION_HANDLER, MyExceptionHandler.class.getCanonicalName());
      KieSessionConfiguration config = KnowledgeBaseFactory.newKnowledgeSessionConfiguration();
      assertEquals(MyExceptionHandler.class.getCanonicalName(),
                   config.getOption(KieSession.UNCAUGHT_EXCEPTION_HANDLER));
      assertEquals(MyExceptionHandler.class.getCanonicalName(), System.getProperty(KieSession.UNCAUGHT_EXCEPTION_HANDLER));
    }
}