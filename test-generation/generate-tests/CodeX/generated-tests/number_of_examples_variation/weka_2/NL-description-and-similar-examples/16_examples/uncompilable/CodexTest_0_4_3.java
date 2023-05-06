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


public class CodexTest_0_4_3 { 
  @Test
    public void testGetAsInstance() {
			AlgVector v = new AlgVector(2);
			v.setElement(0, 1.0);
			v.setElement(1, 2.0);
			Instances model = new Instances(new Instance(2), 0);
			model.setClassIndex(0);
			Random random = new Random(1);
			try {
			  Instance inst = v.getAsInstance(model, random);
			  assertEquals(2, inst.numAttributes());
			  assertEquals(1.0, inst.value(0), 1e-15);
			  assertEquals(2.0, inst.value(1), 1e-15);
			} catch (Exception e) {
			  fail(e.getMessage());
			}
		  }
}