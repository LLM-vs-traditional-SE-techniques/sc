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


public class CodexTest_0_6_8 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 3;
    int numAttributesPerInstance = 3;
    try {
      Instances data = new Instances(new StringReader(
						       "a,b,c,d\n" +
						       "0,1,2,3\n" +
						       "4,5,6,7\n" +
						       "8,9,10,11\n"));
      AlgVector algVec = new AlgVector(numInstances);
      double[] values = new double[numAttributes];
      for (int i = 0; i < numInstances; i++) {
	for (int j = 0; j < numAttributesPerInstance; j++) {
	  values[j] = i * numAttributesPerInstance + j + 1;
	}
	algVec.addElement(new DenseInstance(1, values));
      }
      Random random = new Random(1);
      Instance in = algVec.getAsInstance(data, random);
      assertEquals("Wrong number of attributes", numAttributes, 
		   in.numAttributes());
      assertEquals("Wrong number of class values", 1, 
		   in.numClasses());
      assertEquals("Wrong number of values", numAttributes, 
		   in.numValues());
      assertEquals("Attribute 0 should be nominal", true, 
		   in.attribute(0).isNominal());
      assertEquals("Attribute 1 should be nominal", true, 
		   in.attribute(1).isNominal());
      assertEquals("Attribute 2 should be numeric", true, 
		   in.attribute(2).isNumeric());
      assertEquals("Value of attribute 0 should be 2", 2, 
		   (int) in.value(0));
      assertEquals("Value of attribute 1 should be 0", 0, 
		   (int) in.value(1));

}