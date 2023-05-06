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


public class CodexTest_0_8_86 { 
  @Test
  public void testGetAsInstance() throws Exception {
    // Build data
    Instances instances = new Instances(new StringReader(
							 "TEST\n" +
							 "1,2,3,4\n" +
							 "5,6,7,8\n"));
    instances.setClassIndex(instances.numAttributes() - 1);
    AlgVector alg = new AlgVector(instances.instance(0));
    // Call method
    Instance instance = alg.getAsInstance(instances, new Random());
    assertEquals("Datatypes are not compatible.", 
		 instance.numAttributes(), alg.numElements());
  }

}