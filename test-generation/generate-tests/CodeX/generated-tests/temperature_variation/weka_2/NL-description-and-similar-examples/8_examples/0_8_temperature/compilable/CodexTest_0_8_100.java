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


public class CodexTest_0_8_100 { 
  @Test
    public void testGetAsInstance() throws Exception {
			Attribute att = new Attribute("Id", (FastVector) null);
			Attribute att1 = new Attribute("Id1", (FastVector) null);
			Attribute att2 = new Attribute("Id2", (FastVector) null);
			FastVector attInfo = new FastVector(5);
			attInfo.addElement(att);
			attInfo.addElement(att1);
			attInfo.addElement(att2);
			Instances inst = new Instances("", attInfo, 1);
			inst.setClassIndex(1);
			AlgVector v = new AlgVector(inst.numAttributes());
			Instance ins = v.getAsInstance(inst, new Random(1));
			assertEquals("Instance integer value differs", 0, (int) ins.value(0));
			assertEquals("Instance integer value differs", 0, (int) ins.value(1));
			assertEquals("Instance integer value differs", 2, (int) ins.value(2));
		  }
}