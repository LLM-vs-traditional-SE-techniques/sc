import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_7 { 
  @Test
  public void testRandomAccess() {
    assertEquals("1", "1", 1, m_TestHelper.toString(testList.randomAccess()));
    assertEquals("1", "1", 1, m_TestHelper.toString(testList.randomAccess()));
  }
}