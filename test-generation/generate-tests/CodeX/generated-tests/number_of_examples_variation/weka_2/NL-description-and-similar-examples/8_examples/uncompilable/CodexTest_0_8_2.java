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


public class CodexTest_0_8_2 { 
  @Test(expected = Exception.class)
	public void getAsInstance_whenDifferentDataTypesGiven_ExceptionShouldBeThrown() throws Exception {
			AlgVector vector = new AlgVector(new double[] { 1, 2, 3 });
			Random rand = new Random();
			Instances testData = null;
			testData = new Instances(new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/test/resources/arff/testdata.arff")));
			Instances testData2 = testData;
			testData2.setClassIndex(testData2.numAttributes() - 1);
			testData.setClassIndex(testData.numAttributes() - 1);
			vector.getAsInstance(testData2, rand);
		}
}