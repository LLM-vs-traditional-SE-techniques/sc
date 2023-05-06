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


public class CodexTest_0_8_55 { 
  @Test
    public void testTypes() {
		Instances d = new Instances("Test", new ArrayList<Attribute>(), 1);
		d.setClassIndex(0);
		d.add(new Attribute("Nominal1", Arrays.asList("val1", "val2")));
		d.add(new Attribute("Nominal2", Arrays.asList("val1", "val2")));
		DenseInstance inst = new DenseInstance(3);
		inst.setDataset(d);
		inst.setClassValue("val1");
		DenseInstance result = (DenseInstance) inst.getAsInstance(d, new Random(1));
		assertEquals("Nominal1", result.stringValue(0));
		assertEquals("val2", result.stringValue(1));
    }
}