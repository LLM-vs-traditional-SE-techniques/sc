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


public class CodexTest_0_4_6 { 
  @Test
    public void testGetAsInstance() {
    double[] data = {1.0, 2.0, 3.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new BufferedReader(new StringReader(
									"@relation test\n"
									+ "@attribute a numeric\n"
									+ "@attribute b numeric\n"
									+ "@attribute c numeric\n"
									+ "@data\n"
									+ "1,2,3\n"
									+ "2,3,4\n"
									+ "3,4,5\n")));
    Random random = new Random(1);
    Instance inst = v.getAsInstance(model, random);
    assertEquals("Wrong number of attributes", 3, inst.numAttributes());
    assertEquals("Wrong class value", 1.0, inst.classValue());
  }
}