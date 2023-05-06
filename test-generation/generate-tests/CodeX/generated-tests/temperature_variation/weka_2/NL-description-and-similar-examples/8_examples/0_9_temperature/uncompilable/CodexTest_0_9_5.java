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


public class CodexTest_0_9_5 { 
  @Test
  public void testGetAsInstance( Instances model, Random random) 
    throws Exception {
	Instances insts = new Instances(model);
	Instance inst = new Instance(insts.numAttributes());
	
	inst.setDataset(insts);
	insts.add(inst);
	  
	int numOfAttrs = inst.numAttributes();
		
	insts.delete();
		
	for (int i = 0 ; i < numOfAttrs; i++) {
	  Attribute attr = inst.attribute(i);
	  if (attr.isNumeric()) {
	    newInst.setValue(i, doubleValue);
	  }
	  else if (attr.isNominal()) {
	    // set a string value
	    newInst.setValue(i, "2");
	  }
	  else {
	    System.out.println("Should not happen!");
	  }
	}
  }
}