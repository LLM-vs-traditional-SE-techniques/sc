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


public class CodexTest_0_9_7 { 
  @Test
    public void getAsInstanceTestRandomNominal() throws Exception {
		AlgVector aV = new AlgVector(2, 1.0);
		Random rng = new Random();
		Attribute at;
		Vector<Attribute> v = new Vector<Attribute>();
		v.add(new Attribute("mmtest0"));
		v.add(new Attribute("mmtest1"));
		Instance test = aV.getAsInstance(new Instances("Test", v, 0), rng);
		assertEquals("Instance number of attributes not correct", 2, test.classIndex());
		at = test.attribute(0);
		assertEquals("The value of Instance attribute 0 was not correct", 1.0, test.value(0), 0.0);
		assertEquals("The strandard deviation of Instance attribute 0 was not correct", 0.0, test.stdDevValue(0), 0.0);
		assertEquals("The index of Instance attribute 0 was not correct", 0, test.index(0));
		assertEquals("The weight at Instance attribute 0 was not correct", 1.0, test.weight(0), 0.0);
		at = test.attribute(1);
		assertEquals("
}