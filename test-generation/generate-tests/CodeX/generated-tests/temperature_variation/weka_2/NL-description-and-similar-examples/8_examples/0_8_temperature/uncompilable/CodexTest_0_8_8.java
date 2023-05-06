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


public class CodexTest_0_8_8 { 
  @Test
   public void testRandomInstance() throws Exception {
			Random random = new Random(0);
			AlgVector v = new AlgVector(new double[]{1, 2, 3});
			Instances data = DatasetGenerator.makeTestDataset(1, 3, 8, random);
			Instance i = v.getAsInstance(data, random);
			assertEquals(8, i.numAttributes());
		}
}