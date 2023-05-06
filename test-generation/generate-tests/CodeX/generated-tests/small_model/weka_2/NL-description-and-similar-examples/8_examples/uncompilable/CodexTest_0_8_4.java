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


public class CodexTest_0_8_4 { 
  @Test
  public void testAsInstanceShouldReturnInstanceWithThreeNumericValues() {
			// given
			Instances model = new Instances("Test", createNumericAttributeList(3), 0);
			DoubleVector v = new DoubleVector(3);
			v.add(1.3);
			v.add(2.7);
			v.add(4.2);
			// when
			Instance newInst = v
}