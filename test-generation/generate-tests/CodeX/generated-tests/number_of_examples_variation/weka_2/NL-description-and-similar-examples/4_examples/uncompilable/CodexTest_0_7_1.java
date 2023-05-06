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


public class CodexTest_0_7_1 { 
  @Test
  public void testGetAsInstance() {
			Instances inst = new Instances(new DummyInstances());
			AlgVector v = new AlgVector(new double[] { 1000.0, 2.3, 1.2, 5.0 });
			Random r = new Random();
			StringBuffer sb = new StringBuffer();
			try {
				Instance in = v.getAsInstance(inst, r);
				for (int i = 0; i < in.numAttributes(); i++) {
					sb.append(in.value(i));
					sb.append(" ");
				}
				assertEquals(sb.toString(), "1000.0 2.3 1.2 5.0 ");
			} catch (Exception e) {
				fail("Exception occured during reading the Instance");
			}
	}
}