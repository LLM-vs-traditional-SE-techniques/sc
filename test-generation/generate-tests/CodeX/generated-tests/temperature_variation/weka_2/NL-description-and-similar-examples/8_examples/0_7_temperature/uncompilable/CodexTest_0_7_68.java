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


public class CodexTest_0_7_68 { 
  @Test
    public void testAsInstance() {
			int numElements = 10;
			AlgVector vector = new AlgVector(numElements);
			for (int i = 0; i < vector.numElements(); i++) {
				vector.setElement(i, i);
			}
			// create dummy model
			Attribute[] attr = new Attribute[numElements];
			ArrayList<Attribute> attrList = new ArrayList<Attribute>(numElements);
			for (int i = 0; i < numElements; i++) {
				attr[i] = new Attribute("a" + i);
				attrList.add(attr[i]);
			}
			Instances model = new Instances(dummy, attrList, 10);
}