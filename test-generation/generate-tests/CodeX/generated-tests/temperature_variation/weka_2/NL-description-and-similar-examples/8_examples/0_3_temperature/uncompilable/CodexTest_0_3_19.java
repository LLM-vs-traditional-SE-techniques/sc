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


public class CodexTest_0_3_19 { 
  @Test
  public void testGetAsInstance() {
    int numAtt = 3;
    int numInst = 10;
    int numNom = 2;
    int numVal = 4;
    int numNum = 1;
    Instances insts = new Instances(new FastVector(), numAtt);
    for (int i = 0; i < numNom; i++) {
      insts.insertAttributeAt(new Attribute("nom" + (i + 1)), i);
    }
    for (int i = 0; i < numNum; i++) {
      insts.insertAttributeAt(new Attribute("num" + (i + 1)), i + numNom);
    }
    insts.insertAttributeAt(new Attribute("class"), numAtt - 1);
    insts.setClassIndex(numAtt - 1);
    Random rand = new Random(1);
    for (int i = 0; i < numInst; i++) {
      Instance inst = new DenseInstance(numAtt);
      inst.setDataset(insts);
      for (int j = 0; j < numNom; j++) {
	int newVal = (int) (rand.nextDouble() * (double) (numVal));
	if (newVal == numVal)
	  newVal -= 1;
	inst.setValue(j, newVal);
      }
      for (int j = 0; j < numNum; j++) {
	inst.setValue(j + numNom, rand.nextDouble());
      }
      inst.setClassValue(rand.nextDouble());
      insts.add(inst);
    }
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    try {
      Instance newInst = v.getAsInstance(insts, rand);
      assertEquals("Datatypes are not compatible.", data.length, 
		   newInst.numValues());
      for (int i = 0; i < data.length; i++)
	assertEquals((i+1) + ". value differs", data[
}