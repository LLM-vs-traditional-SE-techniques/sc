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
    public void testInstance() {
		double[] instVals = {2.0, 0.0};
		DenseInstance inst = new DenseInstance(instVals.length);
		inst.setValue(0, instVals[0]);
		inst.setValue(1, instVals[1]);
		assertEquals(instVals[0], inst.value(0), 1.0e-6);
		assertEquals(instVals[1], inst.value(1), 1.0e-6);
}