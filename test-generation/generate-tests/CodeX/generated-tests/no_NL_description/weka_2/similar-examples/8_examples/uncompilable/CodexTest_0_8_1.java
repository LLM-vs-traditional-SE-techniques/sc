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


public class CodexTest_0_8_1 { 
  @Test
  public void testClassType() {
    Instances newInst = new Instances(m_Instances, 0);
    newInst.setClassIndex(m_Instances.numAttributes()-1);
    assertEquals(newInst.classAttribute().type(), Attribute.NOMINAL);
  }
}