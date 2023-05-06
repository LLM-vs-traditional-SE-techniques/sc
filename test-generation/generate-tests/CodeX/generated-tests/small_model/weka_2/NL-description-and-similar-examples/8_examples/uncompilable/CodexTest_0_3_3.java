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


public class CodexTest_0_3_3 { 
  @Test
  public void testGetAsInstanceShouldReturnInstanceWithValuesFromVector() {
			// given
			Instances model = new Instances("Test", new Attribute[] {
					new Attribute("x"), new Attribute("y"), new Attribute("z")
			}, 0);
			AlgVector v = new AlgVector(new double[] { 1, 2, 3 });
			// when
			Instance newInst = v
}