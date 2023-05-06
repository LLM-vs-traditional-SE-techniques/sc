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


public class CodexTest_0_5_10 { 
  @Test
    public void testGetAsInstanceShouldReturnNullWhenNoElements() {
			// given
			Instances model = new Instances("test", new Attribute[] {
					new Attribute("attr1", 0),
					new Attribute("attr2", 0) }, 0);
			AlgVector v = new AlgVector(new double[] {});
			// when
			Instance newInst = v.getAs
}