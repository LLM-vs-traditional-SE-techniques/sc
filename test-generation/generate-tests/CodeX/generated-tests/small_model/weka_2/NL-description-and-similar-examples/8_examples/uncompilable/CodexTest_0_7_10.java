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


public class CodexTest_0_7_10 { 
  @Test
    public void testGetAsInstance1() throws Exception {
		final DenseInstance instance = 
				new DenseInstance(new double[] {1.0, 1.0});
		final Instances instances = new Instances("test",
				new Attribute[] {new Attribute("att1", 0), new Attribute("att2", 0)}, 0);
		instances.add(instance);
		final AlgVector vector = new Alg
}