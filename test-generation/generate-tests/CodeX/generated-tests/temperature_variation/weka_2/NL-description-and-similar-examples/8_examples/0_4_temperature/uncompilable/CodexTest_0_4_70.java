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


public class CodexTest_0_4_70 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 10;
    int numNumeric = 2;
    int numNominal = 1;
    int numValues = 3;
    Random random = new Random(1);
    Instances data = new Instances(new BufferedReader(new StringReader(
        "data,data,data\n" + ",," + "\n" + ",," + "\n" + ",," + "\n" + ",,"
            + "\n" + ",," + "\n" + ",," + "\n" + ",," + "\n" + ",," + "\n"
            + ",," + "\n" + ",," + "\n")));
    data.setClassIndex(data.numAttributes() - 1);
    data.deleteAttributeAt(0);
    data.deleteAttributeAt(0);
    for (int i = 0; i < numNumeric; i++) {
      data.insertAttributeAt(new Attribute("num" + (i + 1)), i);
    }
    for (int i = 0; i < numNominal; i++) {
      data.insertAttributeAt(new Attribute("nom" + (i + 1), numValues),
          numNumeric + i);
    }
    double[] values = new double[numAttributes];
    for (int i = 0; i < numInstances; i++) {
      for (int j = 0; j < numNumeric; j++) {
        values[j] = random.nextDouble();
      }
      for (int j = 0; j < numNominal; j++) {
        values[numNumeric + j] = random.nextInt(numValues);
      }
      data.add(new DenseInstance(1.0, values));
    }
    AlgVector algVector = new AlgVector(values);
    Instance instance = algVector.getAsInstance(data, random);
    assertEquals(numAttributes, instance.numAttributes());
    assertEquals(numNumeric, instance.numInputAttributes());
    assertEquals(numNominal, instance
}