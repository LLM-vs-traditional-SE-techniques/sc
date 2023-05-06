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


public class CodexTest_0_9_11 { 
  @Test
    public final void testAddVector3By3() {
			double[] arr1 = {1,2,3};
			AlgVector v1 = new AlgVector(arr1);
			double[] arr2 = {4,5,6};
			AlgVector v2 = new AlgVector(arr2);
			AlgVector v3 = (AlgVector)v1.add(v2);
						double[] res = {5,7,9};
}