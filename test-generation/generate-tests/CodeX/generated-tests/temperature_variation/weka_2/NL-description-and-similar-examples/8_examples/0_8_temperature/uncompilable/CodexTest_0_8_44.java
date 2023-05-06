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


public class CodexTest_0_8_44 { 
  @Test
     public void testGetAsInstance() throws Exception {
			AlgVector v = new AlgVector(new double[] { 1, 2, 3 });
			double[] data = { 0, 1, 2, 3 };
			FastVector atts = new FastVector();
			atts.addElement(new Attribute("a"));
			atts.addElement(new Attribute("b"));
			atts.addElement(new Attribute("c"));
			atts.addElement(new Attribute("d"));
			Instances inst = new Instances("test", atts, 0);
			inst.add(new Instance(1, data));
			Instance instA = v.getAsInstance(inst, new Random(1));
			assertEquals(instA.toString(), inst.get(0).toString());
	}
*/
}