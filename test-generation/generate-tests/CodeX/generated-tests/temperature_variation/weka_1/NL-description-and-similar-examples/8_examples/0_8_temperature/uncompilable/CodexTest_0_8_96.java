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


public class CodexTest_0_8_96 { 
  @Test
  public static void DoubleTest16() {
			double[] arr = { -0.3, 0.3, 0.9 };
			AlgVector v = new AlgVector(arr);
			AlgVector w = new AlgVector(-0.3, 0.3, 0.9);
			AlgVector z = v.add(w);
			System.out.println(z.toString());
		}
}