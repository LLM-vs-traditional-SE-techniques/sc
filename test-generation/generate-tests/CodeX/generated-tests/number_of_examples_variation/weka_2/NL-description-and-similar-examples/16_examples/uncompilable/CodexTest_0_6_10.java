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


public class CodexTest_0_6_10 { 
  @Test
    public void testGetAsInstance() {
	try {
	  double[] values = new double[2];
	  values[0] = 1;
	  values[1] = 2.3;
	  Instances insts = new Instances(new StringReader("@relation test\n"+
							   "@attribute a1 numeric\n"+
							   "@attribute a2 numeric\n"+
							   "@attribute a3 {a,b,c}\n"+
							   "@attribute a4 {a,b}\n"+
							   "@data\n"+
							   "0,0,a,a\n"+
							   "1,1,b,b\n"+
							   "2,2,c,a\n"+
							   "3,3,a,c\n"));
	  AlgVector v = new AlgVector(values);
	  Random r = new Random(1);
	  Instance i = v.getAsInstance(insts, r);
	  assertEquals("First value not set correctly", 1, i.value(0), 1e-6);
	  assertEquals("Second value not set correctly", 2.3, i.value(1), 1e-6);
	  assertEquals("Third value not set correctly", "b", i.stringValue(2));
	  assertEquals("Fourth value not set correctly", "a", i.stringValue(3));
	} catch (Exception ex) {
	  ex.printStackTrace();
	  fail("Exception thrown: " + ex.getMessage());
	}
      }
}