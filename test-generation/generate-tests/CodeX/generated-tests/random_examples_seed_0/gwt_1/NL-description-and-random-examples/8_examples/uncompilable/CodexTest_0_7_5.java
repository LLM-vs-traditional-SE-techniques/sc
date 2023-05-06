import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_5 { 
  @Test
  public void testEmptyXmlString() throws Exception {
    String xml = "";
    String mimeType = "text/plain";
    String charset = "UTF-8";
    String result = HtmlUtils.escapeXml(xml, mimeType, charset, isClient());
    assertEquals(xml, result);
  }
}