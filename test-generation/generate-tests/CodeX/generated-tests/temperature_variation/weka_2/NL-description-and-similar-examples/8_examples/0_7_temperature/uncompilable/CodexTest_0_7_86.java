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


public class CodexTest_0_7_86 { 
  @Test
  public void testGetAsInstance() {
    Instances i = new Instances(new BufferedReader(new StringReader(InstancesTest.IRIS_DATASET)));
    Instance in = new DenseInstance(4);
    in.setDataset(i);
    in.setValue(0, 1);
    in.setValue(1, 2);
    in.setValue(2, 3);
    in.setValue(3, 4);
    AlgVector v = AlgVector.getAsVector(in);
    Random r = new Random(1);
    Instance out = v.getAsInstance(i, r);
    assertEquals(in.toString(), out.toString());
  }
}