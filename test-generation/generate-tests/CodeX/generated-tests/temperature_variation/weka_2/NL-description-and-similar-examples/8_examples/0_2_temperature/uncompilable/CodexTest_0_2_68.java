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


public class CodexTest_0_2_68 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 10;
    int numInstances = 20;
    int numClasses = 3;
    int numNumeric = 5;
    int numNominal = numAttributes - numNumeric;
    int numString = 2;
    int numDate = 1;
    int numRelational = 1;
    int numInstancesRelational = 10;
    int numAttributesRelational = 5;
    int numClassesRelational = 2;
    int numNumericRelational = 2;
    int numNominalRelational = numAttributesRelational - numNumericRelational;
    int numStringRelational = 1;
    int numDateRelational = 1;
    int numRelationalRelational = 1;
    int numInstancesRelationalRelational = 5;
    int numAttributesRelationalRelational = 3;
    int numClassesRelationalRelational = 2;
    int numNumericRelationalRelational = 1;
    int numNominalRelationalRelational = 
      numAttributesRelationalRelational - numNumericRelationalRelational;
    int numStringRelationalRelational = 1;
    int numDateRelationalRelational = 1;
    int numRelationalRelationalRelational = 0;
    Instances data = null;
    Instances relationalData = null;
    Instances relationalRelationalData = null;
    try {
      data = TestInstances.createRandomInstances(numAttributes, numInstances, 
						 numClasses, numNumeric, 
						 numNominal, numString, numDate, 
						 numRelational, 
						 numInstancesRelational, 
						 numAttributesRelational, 
						 numClassesRelational, 
						 numNumericRelational, 
						 numNominalRelational, 
						 numStringRelational, 
						 numDateRelational, 
						
}