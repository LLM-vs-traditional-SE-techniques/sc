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


public class CodexTest_0_9_16 { 
  @Test
    public void testGetAsInstance() {
	
		int numAttributes = 0;
		int numNumeric = 0;
		int numNominal = 0;
		
		// First 20 attributes = numeric
		int[][] indices = new int [numNumeric][10];
		double[][] values = new double [numNumeric][10];
		for (int k = 0; k < numAttributes; k++) {
			// Create random values
			indices[k] = MathUtils.randomIntArray(10, 100, 400);
			values[k] = MathUtils.randomDoubleArray(10, -5, 5);
		}
		// Last 15 attributes = nominal
		indices[numNumeric] = MathUtils.randomIntArray(10, 0, 1);
		// no values are set for nominal attribute
		values[numNumeric] = MathUtils.randomDoubleArray(10, -5, 5);
		
		int numInstances = 100;
		int NUM_INSTANCES = 100;
		Instances dataset = null;
		
		boolean[] dataType = new boolean [numAttributes];
		for (int k = 0; k < numAttributes; k++) {
			if (numNumeric != 0) {
				dataType[k] = true;
			} else if (numNominal != 0) {
				dataType[k] = false;
			}
		}
		dataset = InstanceGenerator.generateInstances(numInstances, 
				numAttributes, NUM_INSTANCES, NUM_INSTANCES, dataType);
		
		AlgVector vector = new AlgVector(
				indices,
				values,
				numNumeric,
				numInstances);
		
		// Test conversion to AlgVector object
		Instance newInst = null;
		Random random = new Random();
		
}