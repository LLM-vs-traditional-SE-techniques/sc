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


public class CodexTest_0_8_93 { 
      @Test
	public void testAddWithOneEmptyAndOneFilledVector() {
		AlgVector vector1 = new AlgVector();
		AlgVector vector2 = new AlgVector(new double[] { 1, 2, 3 });
}