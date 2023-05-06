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


public class CodexTest_0_7_1 { 
  @Test
    public void testAdd() {
			AlgVector v = new AlgVector(new double[] {1, 2});
			AlgVector w = new AlgVector(new double[] {3, 4});
			AlgVector u = v.add(w);
}