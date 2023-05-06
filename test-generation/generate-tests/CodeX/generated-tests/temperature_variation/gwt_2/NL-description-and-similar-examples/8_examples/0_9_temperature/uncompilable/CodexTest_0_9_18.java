import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_18 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final StringBuilder message = new StringBuilder();
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        message.append(e.getMessage());
      }
    });
    assertEquals(0, message.length());
    try {
      throw new Exception("MyException");
    } catch (Exception e) {
    }
    assertEquals("MyException", message.toString());
  }
 * */
public class TestCaseSourceCodeGenerator {
  private static final String TAB = "  ";
  private static final String LINE_BREAK = "\n";
  
  private static final String PACKAGE_LINE_TEMPLATE = "package %s;";
  private static final String IMPORTS_LINE_TEMPLATE = "import %s";
  private static final String IMPORTS_LINE_TEMPLATE_WITH_AS_KEYWORD = "import %s as %s";
  
  private static final String CLASS_START_LINE_TEMPLATE = "public class %s %s {" + LINE_BREAK;
  private static final String STATIC_BLOCK_TEMPLATE = "static {" + LINE_BREAK + "%s" + LINE_BREAK + "}";
  private static final String FIELDS_TEMPLATE = "%s" + LINE_BREAK;
  private static final String METHOD_START_LINE_TEMPLATE = "%spublic %s %s(%s) %s {" + LINE_BREAK;
  private static final String ASSERT_LINE_TEMPLATE = "%sassertEquals(%s,%s);" + LINE_BREAK;
  private static final String ASSERT_TRUE_LINE_TEMPLATE = "%sassertTrue(%s);" + LINE_BREAK;
  private static final String ASSERT_FALSE_LINE_TEMPLATE = "%sassertFalse(%s);" + LINE_BREAK;
  private static final String ASSERT_
}