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


public class CodexTest_0_7_9 { 
  @Test
  public void testGetAsInstance() throws Exception {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new BufferedReader(
				       new FileReader(new File(data.arff))));
    model.setClassIndex(model.numAttributes() - 1);
    Instance inst = v.getAsInstance(model, new Random(1));
    assertEquals("Number of class labels differs", 2, 
		 (int) model.attribute(model.classIndex()).numValues());
    assertEquals("Datatypes are not compatible", data.length, 
		 inst.numValues());
  }
}