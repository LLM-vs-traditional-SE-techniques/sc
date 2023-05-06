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


public class CodexTest_0_8_3 { 
  @Test
  public void testGetAsInstance() throws Exception {
    int len = 10;
    AlgVector v = createRandomVector(len);
    Instances m = getRandomInstances(len);
    
    // Create random instance
    Instance i = createRandomInstance(m);
    Instance i2 = v.getAsInstance(m, new Random(1));
    
    assertEquals(i, i2);
  }
  
  private AlgVector createRandomVector(int length) {
    double[] data = new double[length];
    for (int i = 0; i < length; i++)
      data[i] = Math.random();
    
    AlgVector v = new AlgVector(data);
    return v;
  }
  
  private Instances getRandomInstances(int length) {
    Instances data = new Instances(new FastVector(), new FastVector());
    for (int i = 0; i < length; i++) {
      Attribute a = new Attribute("Attribute-" + i);
      data.insertAttributeAt(a, data.numAttributes());
    }
    data.setClassIndex(data.numAttributes()-1);
    return data;
  }
  
  private Instance createRandomInstance(Instances data) {
}