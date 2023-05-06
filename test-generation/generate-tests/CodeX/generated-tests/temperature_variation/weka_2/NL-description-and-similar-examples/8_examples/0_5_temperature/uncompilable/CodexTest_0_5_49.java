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


public class CodexTest_0_5_49 { 
  @Test
    public void testGetAsInstance() {
		Instances model = new Instances(new Instances(new BufferedReader(new StringReader(
				"@relation Test\n"
				+ "@attribute x numeric\n"
				+ "@attribute y numeric\n"
				+ "@attribute z numeric\n"
				+ "@data\n"))));
		
		double[] values = {1.0, 2.0, 3.0};
		AlgVector vector = new AlgVector(values);
		
		Instance instance = vector.getAsInstance(model, new Random(1));
		
		assertEquals("Number of values differs", 3, instance.numValues());
		assertEquals("Value differs", 1.0, instance.value(0), 0.0);
		assertEquals("Value differs", 2.0, instance.value(1), 0.0);
		assertEquals("Value differs", 3.0, instance.value(2), 0.0);
	}
}