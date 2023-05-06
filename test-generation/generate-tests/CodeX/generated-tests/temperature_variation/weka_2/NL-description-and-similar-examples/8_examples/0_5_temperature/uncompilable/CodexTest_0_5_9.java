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


public class CodexTest_0_5_9 { 
  @Test
  public void testGetAsInstance() throws Exception {
    // create a vector
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    
    // create a model
    Instances model = new Instances(new BufferedReader(new StringReader(
	"@RELATION test\n" +
	"@ATTRIBUTE x1 NUMERIC\n" +
	"@ATTRIBUTE x2 NUMERIC\n" +
	"@ATTRIBUTE x3 NUMERIC\n" +
	"@ATTRIBUTE x4 NUMERIC\n" +
	"@ATTRIBUTE x5 NUMERIC\n" +
	"@ATTRIBUTE x6 NUMERIC\n" +
	"@ATTRIBUTE x7 NUMERIC\n" +
	"@DATA\n")));
    
    // create an instance
    Instance inst = v.getAsInstance(model, new Random(1));
    
    // check the instance
    assertEquals("Length differs", model.numAttributes(), inst.numAttributes());
    assertEquals("1. value differs", 2.3, inst.value(0));
    assertEquals("2. value differs", 1.2, inst.value(1));
    assertEquals("3. value differs", 5.0, inst.value(2));
    assertEquals("4. value differs", 1.0, inst.value(3));
    assertEquals("5. value differs", 0.0, inst.value(4));
    assertEquals("6. value differs", 0.0, inst.value(5));
    assertEquals("7. value differs", 0.0, inst.value(6));
  }
}