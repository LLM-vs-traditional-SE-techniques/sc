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


public class CodexTest_0_9_43 { 
    @Test
	public void testNumAttributes() {
		FastVector atts = new FastVector(2);
		atts.addElement(new Attribute("att1"));
		atts.addElement(new Attribute("att2"));
		Instances instances = new Instances("test", atts, 0);
		AlgVector vector = new AlgVector();
		try {
			Instances dataset = vector.getAsInstance(instances, new Random(0));
			assertEquals("Number of attributes have to be equal", atts.size(), dataset.numAttributes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}