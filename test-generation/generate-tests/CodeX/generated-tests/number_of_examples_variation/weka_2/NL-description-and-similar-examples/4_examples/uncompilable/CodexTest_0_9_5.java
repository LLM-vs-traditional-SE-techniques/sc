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


public class CodexTest_0_9_5 { 
  @Test
    public void testAsInstance() {
			Instances insts = ClassifierTools.loadData("dot_data.txt");
			Random rand = new Random(0);
			AlgVector vec = new AlgVector(insts.numAttributes());
			int i, j;
			for (i = 0, j = 0; i < insts.numAttributes(); i++) {
				Attribute att = insts.attribute(i);
				if (att.isNumeric()) {
					vec.setElement(j++, i);
				}
				if (att.isNominal()) {
					// Must set to one of possible vals
					vec.setElement(j++, (rand.nextDouble() * (double) (att
							.numValues())));
				}
				if (att.isString()) {
					fail("Didnt expect to see a string attribute.");
				}
			}
			Instance inst = vec.getAsInstance(insts, rand);
			assertEquals("Created instance does not match.", insts.numAttributes(),
					inst.numAttributes());
			assertEquals("Dataset did not persist.", insts, inst.dataset());
		}
}