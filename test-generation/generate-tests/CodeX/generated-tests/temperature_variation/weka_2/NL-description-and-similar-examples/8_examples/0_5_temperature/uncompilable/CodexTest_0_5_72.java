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


public class CodexTest_0_5_72 { 
  @Test
    public void testGetAsInstance() {
			int numAtt = 3;
			int numVal = 3;
			int numElements = 2;
			Random random = new Random(1);
			Instances model = new Instances(new Instances(new StringReader(
					"@RELATION\n" +
					"@ATTRIBUTE a NUMERIC\n" +
					"@ATTRIBUTE b {0,1,2}\n" +
					"@ATTRIBUTE c NUMERIC\n" +
					"@DATA\n" +
					"0.0,0,0.0\n" +
					"1.0,0,1.0\n" +
					"2.0,0,2.0\n" +
					"3.0,1,3.0\n" +
					"4.0,1,4.0\n" +
					"5.0,1,5.0\n" +
					"6.0,2,6.0\n" +
					"7.0,2,7.0\n" +
					"8.0,2,8.0\n"
					)));
			double[] elements = new double[numElements];
			for (int i = 0; i < numElements; i++) {
				elements[i] = i;
			}
			AlgVector vector = new AlgVector(elements);
			Instance inst = vector.getAsInstance(model, random);
			assertEquals("Number of attributes differs", numAtt, inst.numAttributes());
			assertEquals("Number of values differs", numVal, model.attribute(1).numValues());
			assertEquals("Number of elements differs", numElements, vector
}