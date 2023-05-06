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


public class CodexTest_0_2_62 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    Instances insts = new Instances(new DenseInstance(numAtts), 0);
    for (int i = 0; i < numAtts; i++) {
      if (i == numAtts - 1) {
	insts.insertAttributeAt(new Attribute("att" + (i + 1)), i);
      } else {
	insts.insertAttributeAt(new Attribute("att" + (i + 1), numVals), i);
      }
    }
    insts.insertAttributeAt(new Attribute("att" + (numAtts + 1), numVals), 
			    numAtts);
    insts.insertAttributeAt(new Attribute("att" + (numAtts + 2), numVals), 
			    numAtts + 1);
    insts.insertAttributeAt(new Attribute("att" + (numAtts + 3), numVals), 
			    numAtts + 2);
    insts.insertAttributeAt(new Attribute("att" + (numAtts + 4), numVals), 
			    numAtts + 3);
    insts.insertAttributeAt(new Attribute("att" + (numAtts + 5), numVals), 
			    numAtts + 4);
    insts.insertAttributeAt(new Attribute("att" + (numAtts + 6), numVals), 
			    numAtts + 5);
    insts.insertAttributeAt(new Attribute("att" + (numAtts + 7), numVals), 
			    numAtts + 6);
    insts.insertAttributeAt(new Attribute("att" + (numAtts + 8), numVals), 
			    numAtts + 7);
    insts.insertAttributeAt(new Attribute("att" + (numAtts + 9), numVals), 
			    numAtts + 8);
    insts.insertAttributeAt(new
}