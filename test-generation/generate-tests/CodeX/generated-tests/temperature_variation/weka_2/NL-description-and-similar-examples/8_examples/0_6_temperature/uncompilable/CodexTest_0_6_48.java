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


public class CodexTest_0_6_48 { 
    @Test(expected = Exception.class)
	public void testGetAsInstance() throws Exception {
		AlgVector vector = new AlgVector(new double[] { 1, 2, 3 });
		Random random = new Random();
		Instances instances = new Instances(new BufferedReader(
				new StringReader(
						"@relation test\n@attribute attr1 numeric\n@attribute attr2 numeric\n@attribute attr3 numeric\n@attribute attr4 numeric\n@data\n0,0,0,0\n")),
				1);
		Instances instances2 = new Instances(new BufferedReader(
				new StringReader(
						"@relation test\n@attribute attr1 numeric\n@attribute attr2 numeric\n@attribute attr3 numeric\n@attribute attr4 numeric\n@attribute attr5 numeric\n@data\n0,0,0,0,0\n")),
				1);
		vector.getAsInstance(instances, random);
		vector.getAsInstance(instances2, random);
	}
}