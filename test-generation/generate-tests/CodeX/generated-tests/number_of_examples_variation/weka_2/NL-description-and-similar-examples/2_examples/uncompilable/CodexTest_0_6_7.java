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


public class CodexTest_0_6_7 { 
  @Test
  public void testGetAsInstance() {
    int numInstances = 3;
    int numNumeric = 3;
    int numNominal = 2;
    int numClasses = 2;
    int numAtt = numNumeric + numNominal + numClasses;
    int numNominalValues = 3;
    int seed = 0;
    int[] nominalValues = new int[numNominal];
    for (int i = 0; i < numNominal; i++)
      nominalValues[i] = numNominalValues;
    Instances model = 
      TestInstances.createRandomInstances(numInstances, numAtt, 
					  numNominal, numNominalValues,
					  numClasses, seed);
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    // check if Instances are equal
    try {
      Instance inst = v.getAsInstance(model, new Random(seed));
      for (int i = 0; i < model.numAttributes(); i++) {
	if (model.attribute(i).isNumeric()) {
	  assertTrue("Numeric values differ", 
	
}