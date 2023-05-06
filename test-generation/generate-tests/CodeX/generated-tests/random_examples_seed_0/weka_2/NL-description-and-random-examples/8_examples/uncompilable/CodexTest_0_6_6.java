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


public class CodexTest_0_6_6 { 
    @Test
    public void testGetAsInstance() throws Exception {
	Instances model = InstancesTestHelper.makeTestInstances();
	Random random = new Random(1);
	Range range = new Range("1,3");
	range.setUpper(model.numAttributes()-1);
	Instances instances = new Instances(model, 0);
	for (int i = 0; i < model.numInstances(); i++) {
	    Instance instance = model.instance(i);
	    Instance newInstance = instance.getAsInstance(model, random);
	    newInstance = newInstance.resample(random, newInstance.weight());
	    instances.add(newInstance);
	}
	assertTrue(instances.equalHeaders(model));
	for (int i = 0; i < model.numInstances(); i++) {
	    assertTrue(instances.instance(i).equalHeaders(model));
	    assertTrue(instances.instance(i).equalHeaders(model));
	    assertTrue(instances.instance(i).equalHeaders(model.instance(i)));
	    for (int j = 0; j < model.numAttributes(); j++) {
		if (model.attribute(j).isNumeric()) {
		    assertEquals(model.instance(i).value(j),
				 instances.instance(i).value(j), 0.0);
		} else {
		    assertEquals(model.instance(i).stringValue(j),
				 instances.instance(i).stringValue(j));
		}
	    }
	}
    }
}