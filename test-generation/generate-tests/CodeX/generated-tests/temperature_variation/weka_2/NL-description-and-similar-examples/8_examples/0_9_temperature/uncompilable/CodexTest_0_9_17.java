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


public class CodexTest_0_9_17 { 
  @Test
    public void testGetAsInstance() {
	AlgVector v = new AlgVector(new double[] {2, 3});
	Random random = new Random();
	Attribute classAtt = new Attribute("Class name", new ArrayList<String>());
	classAtt.setWeight(1);
	List<Attribute> attrs = new ArrayList<Attribute>();
	attrs.add(classAtt);
	InstancesHeader ih = new InstancesHeader(new MockDataset(), attrs, 2);
	try {
	  Instance i = v.getAsInstance(ih, random);
	  assertEquals("Length differs", 2, i.numValues());
	  assertEquals("Differ at 1", 2, i.value(0));
	  assertEquals("Differ at 2", 3, i.value(1));
	} catch (Exception e) {
	  throw new AssertionError("Exception thrown");
	}		
  }
}