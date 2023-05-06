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


public class CodexTest_0_5_27 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances dataset = new Instances(new BufferedReader(new StringReader(
        "A,B,C\n" + "1,2,3\n" + "4,5,6\n" + "7,8,9\n")));
    dataset.setClassIndex(2);
    Random random = new Random(1);
    AlgVector v = new AlgVector(new double[] { 1, 2, 3 });
    Instance inst = v.getAsInstance(dataset, random);
    assertEquals(1, inst.value(0));
    assertEquals(2, inst.value(1));
    assertEquals(0, inst.classValue());
    v = new AlgVector(new double[] { 4, 5, 6 });
    inst = v.getAsInstance(dataset, random);
    assertEquals(4, inst.value(0));
    assertEquals(5, inst.value(1));
    assertEquals(0, inst.classValue());
    v = new AlgVector(new double[] { 7, 8, 9 });
    inst = v.getAsInstance(dataset, random);
    assertEquals(7, inst.value(0));
    assertEquals(8, inst.value(1));
    assertEquals(1, inst.classValue());
  }
}