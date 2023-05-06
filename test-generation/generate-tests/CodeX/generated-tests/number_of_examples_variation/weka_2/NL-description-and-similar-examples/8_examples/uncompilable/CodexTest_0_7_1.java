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


public class CodexTest_0_7_1 { 
  @Test
  public void testGetAsInstance() {
    int numInst = 17;
    int numAtt = 3;
    Random rand = new Random(1);
    Instances inst = new Instances(new BufferedReader(
						      new StringReader(m_Instances)), numInst);
    inst.setClassIndex(2);
    double[] vals = {1.0, 2.0, 3.0};
    AlgVector vec = new AlgVector(vals);
    for (int i = 0; i < numInst; i++) {
      Instance in = vec.getAsInstance(inst, rand);
      assertEquals("Datatypes are not compatible.", numAtt, in.numAttributes());
      assertEquals("Datatypes are not compatible.", inst.classIndex(),
		   in.classIndex());
      assertEquals("Datatypes are not compatible.", vals[0], in.value(0));
      assertEquals("Datatypes are not compatible.", vals[1], in.value(1));
      assertEquals("Datatypes are not compatible.", (int) vals[2], 
		   (int) in.value(2));
    }
  }
}