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


public class CodexTest_0_8_34 { 
  @Test
	public void testGetAsInstance() throws Exception {
    Instances instances = new Instances(
        instanceBuilder.newInstanceBuilder().build());
    AlgVector vector = new AlgVector(m_Elements);
    Instance instance = vector.getAsInstance(instances, new Random());
    Assert.assertEquals(instances.numAttributes(), instance.numAttributes());
	}
}