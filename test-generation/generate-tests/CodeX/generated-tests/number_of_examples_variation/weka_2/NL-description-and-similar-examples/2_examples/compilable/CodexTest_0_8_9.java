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
  public void testGetAsInstance() {
			double[] data = {1.1, 2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			try {
				v.getAsInstance(null, null);
				fail("Should have got Exception here");
			} catch (Exception ex) {
				// expected
			}
		  }
}