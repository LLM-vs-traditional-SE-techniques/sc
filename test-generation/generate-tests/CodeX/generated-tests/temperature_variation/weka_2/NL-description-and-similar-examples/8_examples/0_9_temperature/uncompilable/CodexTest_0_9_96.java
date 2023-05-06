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


public class CodexTest_0_9_96 { 
  @Test
    public void testGetAsInstance() throws Exception {
	Instances data = makeTestInstances();
	data.setClassIndex(data.numAttributes() - 1);
	data.deleteAttributeAt(1);
	Random random = new Random(42L);
	double[] values = {1.0, 3.0, 5.0, 7.0, 9.0, 11.0};
	AlgVector vector = new AlgVector(values);
	Instance prepared = vector.getAsInstance(data, random);
}