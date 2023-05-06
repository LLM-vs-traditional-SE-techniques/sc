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


public class CodexTest_0_9_86 { 
  @Test
  public void testEuclideanDistanceSimple() throws Exception {
		AlgVector p1 = new AlgVector(10,1);
		AlgVector p2 = new AlgVector(10,2);
		Instances is = null;
		Instances is2 = null;
		EuclideanDistance f1 = new EuclideanDistance();
		EuclideanDistance f2 = new EuclideanDistance();
}