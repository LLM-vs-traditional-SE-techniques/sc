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


public class CodexTest_0_9_42 { 
  @Test
  public void testGetAsInstance() {
    double[] d = {1.1, 2.2, 3.3, 4.4, 5.5};
    boolean[] nominal = {false, false, true, false, true};
    int numAttr = 5;
    Instances model = null;
    // Create a "model" dataset instance
    try {
      model = new Instances("Dataset", makeFastVector(numAttr), 10);
      //make a nominal attribute
      String[] values = {"head", "body", "tail"};
      Attribute a = new Attribute(values);
      // Add an attribute of each datatype
      for (int i = 0;i < numAttr;i++) {
        if (nominal[i]) {
          model.insertAttributeAt(a, model.numAttributes());
	  model.renameAttribute(model.numAttributes() - 1, 
				"NomAttr" + (model.numAttributes() - 1));
        } else {
          model.insertAttributeAt(new Attribute("NumAttr" +
						(model.numAttributes())), 
				   model.numAttributes());
        }
      }
      model.setClassIndex(model.numAttributes() - 1);
    } catch (Exception e) {
      fail("Problem setting up Instances object");
    }
    // Make a vector and test the makeInstance method
    AlgVector vec = new AlgVector(d);
    Instance inst = null;
    try {
      inst = vec.getAsInstance(model, new Random(2));
    } catch (Exception e) {
      fail("Problem calling getAsInstance()");
    }
    assertEquals("Length of instance not correct", model.numAttributes(),
		 inst.numAttributes());
    for (int i = 0;i < numAttr;i++) {
      if (nominal[i]) {
	assertTrue("Value should be nominal",
		   inst.attribute(i).isNominal());
      } else {
	assertTrue("Value should be
}