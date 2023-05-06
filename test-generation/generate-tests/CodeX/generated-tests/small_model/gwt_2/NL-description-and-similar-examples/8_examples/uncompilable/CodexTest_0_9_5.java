import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  @Test
  {
    Enhancer en = new Enhancer();
    en.setClassLoader(GWT.class.getClassLoader());
    en.setClassName("org.eclipse.aether.AbstractArtifact");
    en.setInterfaces(new Class[] { org.eclipse.aether.AbstractArtifact.class });
  }
}