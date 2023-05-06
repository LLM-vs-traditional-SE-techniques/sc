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


public class CodexTest_0_6_1 { 
  @Test
  public void testInstanceConstructor() {
			int numAtt = 3;
			int numVal = 4;
			int[] numValClass = {3, 2, 1};
			int[] atts = {0, 1, 2};
			FastVector attInfo = new FastVector(numAtt);
			for (int i = 0; i < numAtt; i++) {
			  FastVector nomVals = new FastVector(numValClass[i]);
			  for (int j = 0; j < numValClass[i]; j++) {
			    nomVals.addElement("val" + j);
			  }
			  Attribute att = new Attribute("att" + i, nomVals);
			  attInfo.addElement(att);
			}
			Instances data = new Instances("test", attInfo, 0);
			double[] values = {1.5, 4.5, 2.5};
			AlgVector v = new AlgVector(values);
			Instance newInst = v.getAsInstance(data, new Random(1));
			for (int i = 0; i < numAtt; i++) {
}