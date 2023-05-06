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


public class CodexTest_0_6_92 { 
    @Test
	public void testGetAsInstance() throws Exception {
		int numAttributes = 2;
		int numInstances = 2;
		Instances model = new Instances(new Random(1), numAttributes,
				numInstances);
		model.setClassIndex(model.numAttributes() - 1);
		model.add(new DenseInstance(numAttributes));
		model.add(new DenseInstance(numAttributes));
		Random random = new Random(42);
}