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


public class CodexTest_0_9_9 { 
  @Test
    public void testFnumericNoRandom() throws Exception {
        AlgVector v = new AlgVector(2);
        v.set(0, 1);
        v.set(1, 2);
        Instances instances = new Instances(new BufferedReader(new StringReader(
                "a,b,c,d\n3.14,?,r,r")), 1);
        instances.setClassIndex(3);
        Instance instance = v.getAsInstance(instances, null);
        assertTrue(instance.isMissing(1));
        assertTrue(instance.attribute(1).isNumeric());
        assertEquals(1, instance.value(0), 1e-6);
        assertEquals(2, instance.value(1), 1e-6);
        assertEquals(0, instance.value(2));
        assertEquals(0, instance.value(3));
    }
    
    Input: public void setClass(Instance inst, String s) {
		int classVal = 0;
		for (classVal = 0; classVal < inst.numClasses(); classVal++)
			if (s.equals(inst.classAttribute().value(classVal)))
				break;
		if (classVal < inst.numClasses())
			inst.setClassValue(classVal);
		else
			System.out.println("Class not set!!!");
	}
	Output: public void testNominalClassNotSet(){
		Instances instances = new Instances(new BufferedReader(new StringReader(
		 "a,b,c,d,class\n3.14,?,r,r,?")), 1);
		instances.setClassIndex(4);
		Instance instance = instances.get(0);
		instance.setMissing(1);
		instance.setMissing(4);
		AlgVector v = new AlgVector();
		v.setClass(instance, "x");	
		assertTrue(instance.isMissing(1));
		assertEquals(0, instance.value(0
}