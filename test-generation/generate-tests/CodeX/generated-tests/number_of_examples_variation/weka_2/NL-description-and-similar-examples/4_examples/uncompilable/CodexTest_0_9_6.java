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


public class CodexTest_0_9_6 { 
  @Test
    public void testGetAsInstanceNominal() {
	Random r = new Random(1);
	
	double[] data1 = {2.3, 1.2, 5.0, 6.0};
	double[] data2 = {5.0, 4.0, 7.0};
	AlgVector v = new AlgVector(data1);
	Instances i = new Instances(new TestInstances(), 0);
	i.insertAttributeAt(new Attribute("1"), 0);
	i.insertAttributeAt(new Attribute("2"), 1);
	i.insertAttributeAt(new Attribute("3"), 2);
	i.insertAttributeAt(new Attribute("4"), 3);
	Instance res = v.getAsInstance(i, r);
	assertEquals((int) res.value(0), 0);
	assertEquals((int) res.value(1), 1);
	assertEquals(res.value(2), 5.0, 0.01);
	assertEquals(res.value(3), 6.0, 0.01);
    }
}