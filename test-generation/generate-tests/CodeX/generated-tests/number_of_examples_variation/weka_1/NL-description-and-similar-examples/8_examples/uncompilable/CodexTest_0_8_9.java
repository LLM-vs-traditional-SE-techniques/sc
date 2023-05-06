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


public class CodexTest_0_8_9 { 
  @Test
   public void testSub() {
	AlgVector a = new AlgVector(new double[] {2.2, 1.1, 21, 4});
	AlgVector b = new AlgVector(new double[] {1.1, 2.2, 2, 3});
	AlgVector c = a.sub(b);
}