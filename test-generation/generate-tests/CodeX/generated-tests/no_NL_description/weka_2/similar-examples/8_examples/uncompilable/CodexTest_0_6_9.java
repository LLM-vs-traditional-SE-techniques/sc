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


public class CodexTest_0_6_9 { 
  @Test
    public void testGetAsInstance() {
	Instances model = new Instances(new BufferedReader(new StringReader(
									   "0,0\n0,1\n0,2\n1,0\n1,1\n1,2\n2,0\n2,1\n2,2\n")));
	model.setClassIndex(model.numAttributes() - 1);
	Random random = new Random(1);
	AlgVector vector = new AlgVector(new double[]{1, 2});
	Instance inst = vector.getAsInstance(model, random);
	assertEquals(1.0, inst.value(0), 0.0);
	assertEquals(2.0, inst.value(1), 0.0);
	assertEquals(0.0, inst.value(2), 0.0);
  }
}