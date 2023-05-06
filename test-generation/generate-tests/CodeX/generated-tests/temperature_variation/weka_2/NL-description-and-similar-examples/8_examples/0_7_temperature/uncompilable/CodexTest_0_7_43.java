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


public class CodexTest_0_7_43 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Random random = new Random(1);
    double[][] testData = {
	{ 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0 },
	{ 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0 },
	{ 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0 }
    };
		
    Instances data = new Instances(new BufferedReader(new 
		    StringReader(RelationalLocator.DATA_SET_1_2)));
    DenseInstance[] instances = new DenseInstance[testData.length];
    for (int i = 0; i < testData.length; i++) {
      instances[i] = new DenseInstance(data.numAttributes());
      instances[i].setDataset(data);
      for (int j = 0; j < testData[i].length; j++) {
	instances[i].setValue(j, testData[i][j]);
      }
    }
}