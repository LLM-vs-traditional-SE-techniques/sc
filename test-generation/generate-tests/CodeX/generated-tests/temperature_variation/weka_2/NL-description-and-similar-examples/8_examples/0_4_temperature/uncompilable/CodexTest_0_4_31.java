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


public class CodexTest_0_4_31 { 
  @Test
    public void testGetAsInstance() throws Exception {
			AlgVector v = new AlgVector(new double[]{1, 2, 3});
			Instances data = new Instances(new BufferedReader(new StringReader(
					"@relation test\n"
					+ "@attribute a numeric\n"
					+ "@attribute b numeric\n"
					+ "@attribute c numeric\n"
					+ "@data\n")));
			Instance inst = v.getAsInstance(data, new Random(1));
			assertEquals("a", 1.0, inst.value(0));
			assertEquals("b", 2.0, inst.value(1));
			assertEquals("c", 3.0, inst.value(2));
		  }
}