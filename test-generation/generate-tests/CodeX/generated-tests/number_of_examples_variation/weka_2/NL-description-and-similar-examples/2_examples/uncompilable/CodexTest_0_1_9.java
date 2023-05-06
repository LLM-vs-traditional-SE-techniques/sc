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


public class CodexTest_0_1_9 { 
  @Test
  public void testGetAsInstance() {
    try {
      int numAtt = 3;
      int numVal = 2;
      int numInst = 10;
      FastVector attInfo = new FastVector(numAtt);
      for (int i = 0; i < numAtt; i++) {
	FastVector values = new FastVector(numVal);
	for (int n = 0; n < numVal; n++)
	  values.addElement("val" + (n+1));
	attInfo.addElement(new Attribute("att" + (i+1), values));
      }
      Instances insts = new Instances("test", attInfo, numInst);
      insts.setClassIndex(insts.numAttributes() - 1);
      double[] data = {1.0, 2.0, 3.0};
      AlgVector v = new AlgVector(data);
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differs", numAtt, inst.numAttributes());
      assertEquals("Number of values differs", numVal, inst.attribute(0).numValues());
      assertEquals("Number of values differs", numVal, inst.attribute(1).numValues());
      assertEquals("Number
}