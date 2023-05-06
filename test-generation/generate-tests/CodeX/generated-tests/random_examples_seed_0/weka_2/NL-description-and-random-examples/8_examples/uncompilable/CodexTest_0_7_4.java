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


public class CodexTest_0_7_4 { 
  @Test
    public void testGetAsInstance() {
    try {
      Instances i = new Instances(new BufferedReader(new FileReader(m_Generator.getOptions().getDataFile())));
      i.setClassIndex(i.numAttributes() - 1);
      DataGenerator.makeDataGenerator(m_Generator.getOptions(), i);
      Instance result = m_Generator.getAsInstance(i, new Random(1));
      assertEquals(i.numAttributes(), result.numAttributes());
      assertEquals(i.numAttributes()-1, result.numClasses());
      assertEquals(i.numClasses(), result.numClasses());
    }
    catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception occurred: " + ex.getMessage());
    }
  }
}