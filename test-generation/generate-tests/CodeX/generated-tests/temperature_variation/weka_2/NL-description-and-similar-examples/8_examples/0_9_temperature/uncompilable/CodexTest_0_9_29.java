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


public class CodexTest_0_9_29 { 
  /**
   * @throws Exception if something goes wrong
   */
  @Test
  public void testGetAsInstance() throws Exception {
    AlgVector v = new AlgVector(new double[] {7.0, 5.0, 1.0});
    Instances model = new Instances(new StringReader(AlgVectorTest.DATAMODEL));
    Random r = new Random(1);
    Instance inst = v.getAsInstance(model, r);
    Instance expected =
	new DenseInstance(model.numAttributes());
    for (int i = 0; i < model.numAttributes(); i++) {
      if (model.attribute(i).isNominal()) {
	expected.setValue(i, new String("big"));
      } else {
	if (i == 1)
	  expected.setValue(i, 7);
	else
	  expected.setValue(i, 0);
      }
    }
    expected.setDataset(model);
    assertEquals(expected, inst);
  }
}