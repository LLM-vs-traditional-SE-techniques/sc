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


public class CodexTest_0_8_1 { 
    @Test public void testGetAsInstance() {
    int numAtts = 4;
    int numInstances = 90;
    Instances data;
    double[] values;
    AlgVector vector = null;
    try {
      data = TestInstances.makeTestInstances(numAtts, numInstances);
      double[] array = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0,
			 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0 };
      vector = new AlgVector(array);
}