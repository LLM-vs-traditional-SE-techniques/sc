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


public class CodexTest_0_8_13 { 
    @Test
	public void testGetAsInstanceClassLabelNotNumeric() throws Exception {
		Instances result = AlgVector.createInstances(2);
		AlgVector v = new AlgVector(1);
		result.add(v.getAsInstance(result, new MockRandom()));
		assertEquals(1, result.numAttributes());
		assertEquals(1, result.attribute(0).numValues());
	}
}