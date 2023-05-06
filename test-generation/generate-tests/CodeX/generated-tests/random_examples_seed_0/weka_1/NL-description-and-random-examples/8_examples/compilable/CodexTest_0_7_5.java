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


public class CodexTest_0_7_5 { 
  @Test(expected = AssertionError.class)
	public void add_nullArgument() throws CloneNotSupportedException {
		AlgVector a = new AlgVector(new double[] {1, 1, 1, 1});
		a.add(null);
	}

}