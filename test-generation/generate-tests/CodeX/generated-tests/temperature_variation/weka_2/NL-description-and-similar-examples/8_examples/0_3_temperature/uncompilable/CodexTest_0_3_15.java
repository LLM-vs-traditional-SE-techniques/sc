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


public class CodexTest_0_3_15 { 
  @Test
    public void testGetAsInstance() throws Exception {
			AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@relation test\n" +
					"@attribute a numeric\n" +
					"@attribute b numeric\n" +
					"@attribute c numeric\n" +
					"@attribute d numeric\n" +
					"@data\n" +
					"1,2,3,4\n" +
					"5,6,7,8\n" +
					"9,10,11,12\n" +
					"13,14,15,16\n" +
					"17,18,19,20\n" +
					"21,22,23,24\n" +
					"25,26,27,28\n" +
					"29,30,31,32\n" +
					"33,34,35,36\n" +
					"37,38,39,40\n" +
					"41,42,43,44\n" +
					"45,46,47,48\n" +
					"49,50,51,52\n" +
					"53,54,55,56\n" +
					"57,58,59,60\n" +
					"61,62,63,64\n" +
					"65,66,67,68\n" +
					"69,70,71,72\n" +
					"73,74,75,76\n" +
					"77,
}