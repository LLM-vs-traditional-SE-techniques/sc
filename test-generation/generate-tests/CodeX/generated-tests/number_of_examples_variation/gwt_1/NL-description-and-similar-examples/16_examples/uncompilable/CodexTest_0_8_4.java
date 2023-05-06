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
  public void testHierarchy() {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext(
        "ns1.xml", "ns2.xml");
    // The application context with the default namespace should have 1
    // bean.
    assertTrue(context.getBeanDefinitionCount() == 1);
    // The application context with the application namespace should have 2
    // beans.
    context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
    assertTrue(context.getBeanDefinitionCount() == 2);
    // No beans should be defined in the application context with the
    // annotation namespace.
    context = new ClassPathXmlApplicationContext(
        "annotationContext.xml");
    assertTrue(context.getBeanDefinitionCount() == 0);
  }
}