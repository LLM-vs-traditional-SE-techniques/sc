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


public class CodexTest_0_3_52 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 4;
    Instances insts = new Instances(new FastVector(numAtts), 0);
    for (int i = 0; i < numAtts; i++) {
      if (i < numAtts - 1) {
	insts.insertAttributeAt(new Attribute("Att" + (i+1)), i);
      } else {
	FastVector vals = new FastVector(numVals);
	for (int j = 0; j < numVals; j++) {
	  vals.addElement("Val" + (j+1));
	}
	insts.insertAttributeAt(new Attribute("Att" + (i+1), vals), i);
      }
    }
    insts.insertAttributeAt(new Attribute("Att" + (numAtts+1)), numAtts);
    insts.insertAttributeAt(new Attribute("Att" + (numAtts+2)), numAtts+1);
    insts.insertAttributeAt(new Attribute("Att" + (numAtts+3)), numAtts+2);
    insts.insertAttributeAt(new Attribute("Att" + (numAtts+4)), numAtts+3);
    insts.insertAttributeAt(new Attribute("Att" + (numAtts+5)), numAtts+4);
    insts.insertAttributeAt(new Attribute("Att" + (numAtts+6)), numAtts+5);
    insts.insertAttributeAt(new Attribute("Att" + (numAtts+7)), numAtts+6);
    insts.insertAttributeAt(new Attribute("Att" + (numAtts+8)), numAtts+7);
    insts.insertAttributeAt(new Attribute("Att" + (numAtts+9)), numAtts+8);
    insts.insertAttributeAt(new Attribute("Att" + (numAtts+10)), numAtts+9);
    insts.insertAttributeAt(new Attribute("Att" + (numAtts
}