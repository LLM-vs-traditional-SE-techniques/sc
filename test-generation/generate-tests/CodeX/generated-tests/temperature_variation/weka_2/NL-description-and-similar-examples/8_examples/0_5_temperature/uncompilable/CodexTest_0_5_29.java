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


public class CodexTest_0_5_29 { 
  @Test
   public void testGetAsInstance() {
	    Instances data = new Instances(new StringReader(
							   "Class,Numeric,Nominal\n"
							   + "c1,0,0\n"
							   + "c2,1,1\n"
							   + "c3,2,2"));
	    data.setClassIndex(0);
	    AlgVector v = new AlgVector(new double[]{1.0, 2.0});
	    Instance inst = v.getAsInstance(data, new Random(1));
	    assertEquals(1.0, inst.value(1));
	    assertEquals(1, (int) inst.value(2));
	  }
}