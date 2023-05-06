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
  private Instances makeInstancesTest() {
			int numAtts = 5;
			int numInstances = 10;
			double[] vals1 = new double[numAtts]; 
			double[] vals2 = new double[numAtts]; 
			double[] vals3 = new double[numInstances];
			vals1[0] = Attribute.NUMERIC;
			vals1[1] = Attribute.NUMERIC;
			vals1[2] = Attribute.NOMINAL;
			vals1[3] = Attribute.NOMINAL;
			vals1[4] = Attribute.NUMERIC;
			vals2[0] = 0;
			vals2[1] = 1;
			vals2[2] = 2;
			vals2[3] = 3;
			vals2[4] = 4;
			for (int i = 0; i < numInstances; i++)
			  vals3[i] = i % 2;
			Instances ret = null;
			try {
				ret = new Instances("TestInstances", 
		
}