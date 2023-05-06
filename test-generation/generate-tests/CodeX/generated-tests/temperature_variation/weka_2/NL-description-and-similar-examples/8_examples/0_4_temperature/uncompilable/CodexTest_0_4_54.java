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


public class CodexTest_0_4_54 { 
  @Test
    public void testGetAsInstance() {
		double[] data = {2.3, 1.2, 5.0};
		AlgVector v = new AlgVector(data);
		try {
			// create a dataset
			FastVector attributes = new FastVector(4);
			attributes.addElement(new Attribute("real1"));
			attributes.addElement(new Attribute("real2"));
			attributes.addElement(new Attribute("real3"));
			attributes.addElement(new Attribute("nominal", (FastVector) null));
			Instances dataset = new Instances("test", attributes, 0);
			dataset.setClassIndex(3);
			// create a random number generator
			Random random = new Random(1);
}