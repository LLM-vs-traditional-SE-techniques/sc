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


public class CodexTest_0_5_55 { 
  @Test
    public void testGetAsInstance() {
			// create Instances object
			Instances insts = new Instances(new BufferedReader(new StringReader(
					"@relation test\n" + "@attribute attr1 numeric\n"
							+ "@attribute attr2 numeric\n"
							+ "@attribute attr3 {a, b, c}\n"
							+ "@attribute attr4 {a, b, c}\n"
							+ "@attribute attr5 {a, b, c}\n"
							+ "@data\n" + "1,2,a,b,c\n" + "3,4,c,a,b\n"
							+ "5,6,b,c,a\n")));
			insts.setClassIndex(2);
			// create AlgVector object
			AlgVector algVec = new AlgVector(new double[] { 1.0, 2.0 });
			// create Instance object
			Instance inst = algVec.getAsInstance(insts, new Random());
			assertEquals("Attribute 1 differs", 1.0, inst.value(0), 0.0);
			assertEquals("Attribute 2 differs", 2.0, inst.value(1), 0.0);
			assertEquals("Attribute 3 differs", insts.classAttribute().value(
					(int) inst.value(2)), inst.stringValue(2));
			assertEquals("Attribute 4 differs", insts.attribute(3).value(
					(int) inst.value(3)), inst.stringValue(3));
			assertEquals("Attribute 5 differs", insts.attribute(4).value(
					(int) inst.value(4)), inst.stringValue(4));
		  }
}