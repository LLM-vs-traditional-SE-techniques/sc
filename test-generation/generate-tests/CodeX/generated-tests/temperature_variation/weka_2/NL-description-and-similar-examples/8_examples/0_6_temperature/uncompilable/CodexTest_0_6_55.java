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


public class CodexTest_0_6_55 { 
  @Test
    public void testGetAsInstance() {
			Instance instance = new Instance(2);
			instance.setValue(0, 1.0);
			instance.setValue(1, 0.0);
			instance.setDataset(new Instances("test", new ArrayList<Attribute>(), 0));
			AlgVector v = new AlgVector(instance);
			assertTrue("The vector should be 1.0,0.0.", (v.getElement(0) == 1.0) && (v.getElement(1) == 0.0));
		}
}