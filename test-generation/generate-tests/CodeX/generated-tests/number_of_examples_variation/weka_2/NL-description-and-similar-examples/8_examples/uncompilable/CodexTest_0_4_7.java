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


public class CodexTest_0_4_7 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 4;
    int numInstances = 10;
    Random random = new Random(1);
    Instances instances = new Instances(new Instances(new BufferedReader(new StringReader("@relation test\n" + "@attribute a numeric\n" + "@attribute b numeric\n" + "@attribute c numeric\n" + "@attribute d numeric\n" + "@data\n" + "0,0,0,0\n" + "0,0,0,0\n" + "0,0,0,0\n" + "0,0,0,0\n" + "0,0,0,0\n" + "0,0,0,0\n" + "0,0,0,0\n" + "0,0,0,0\n" + "0,0,0,0\n" + "0,0,0,0\n"))));
    double[] values = new double[numAttributes];
    for (int i = 0; i < numInstances; i++) {
      for (int j = 0; j < numAttributes; j++) {
        values[j] = random.nextDouble();
      }
      Instance instance = new DenseInstance(1.0, values);
      instances.add(instance);
    }
    AlgVector algVector = new AlgVector(values);
    Instance newInst = algVector.getAsInstance(instances, random);
    assertTrue("Datatypes are not compatible.", ((newInst.value(0)) == (values[0])));
    assertTrue("Datatypes are not compatible.", ((newInst.value(1)) == (values[1])));
    assertTrue("Datatypes are not compatible.", ((newInst.value(2)) == (values[2])));
    assertTrue("Datatypes are not compatible.", ((newInst.value(3)) == (values[3])));
  }
}