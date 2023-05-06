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


public class CodexTest_0_6_8 { 
  @Test
  public void testToInstance() {
			double[] values = {1.0, 2.0, 3.0, 4.0};
			AlgVector vector = new AlgVector(values);
			Instances dataset = new Instances(new StringReader(
					"@RELATION test\n" +
					"@ATTRIBUTE a1 NUMERIC\n" +
					"@ATTRIBUTE a2 NUMERIC\n" +
					"@ATTRIBUTE a3 NUMERIC\n" +
					"@ATTRIBUTE a4 NUMERIC\n" +
					"@ATTRIBUTE a5 NUMERIC\n" +
					"@ATTRIBUTE a6 NUMERIC\n" +
					"@ATTRIBUTE a7 NUMERIC\n" +
					"@ATTRIBUTE class {0,1,2}\n" +
					"@DATA\n" +
					",,,"
			));
			Random random = new Random();
			Instance instance = vector.getAsInstance(dataset, random);
			assertEquals("a1", 1.0, instance.value(0), 0.0);
			assertEquals("a2", 2.0, instance.value(1), 0.0);
			assertEquals("a3", 3.0, instance.value(2), 0.0);
			assertEquals("a4", 4.0, instance.value(3), 0.0);
			assertEquals("a5", 0.0, instance.value(4), 0.0);
			assertEquals("a6", 0.0, instance.value(5), 0.0);
			assertEquals("a7", 0.0, instance.value(6), 0.0);
			assertEquals("class", 0, instance.value(7), 0
}