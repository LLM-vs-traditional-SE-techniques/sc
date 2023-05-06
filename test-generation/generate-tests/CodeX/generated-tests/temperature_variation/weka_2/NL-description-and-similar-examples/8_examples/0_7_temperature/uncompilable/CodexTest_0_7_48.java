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


public class CodexTest_0_7_48 { 
  @Test
    public void testNominalAttribute() {
		double[] data = {2.3, 1.2, 5.0};
		AlgVector v = new AlgVector(data);
		
		Random rnd = new Random();
		v.getAsInstance(new Instances(new BufferedReader(new StringReader(instances)), 0), rnd);
	}
}