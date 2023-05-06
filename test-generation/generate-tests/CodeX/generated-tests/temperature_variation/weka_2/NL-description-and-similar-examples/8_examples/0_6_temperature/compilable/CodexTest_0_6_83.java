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


public class CodexTest_0_6_83 { 
  @Test
    public void testGetAsInstance() {
			double[] data = { 2.3, 1.2, 5.0 };
			AlgVector v = new AlgVector(data);
			try {
				v.getAsInstance(null, null);
				fail();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}