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


public class CodexTest_0_8_5 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = new Instances(new StringReader(
						     "instance,value\n" +
						     ",\n" +
						     "1,1\n" +
						     "2,2\n" +
						     "3,3\n" +
						     "4,4\n" +
						     "5,5\n" +
						     "6,6\n" +
						     "7,7\n" +
						     "8,8\n" +
						     "9,9\n" +
						     "10,10\n"));
    model.setClassIndex(1);
    DenseInstance inst = new DenseInstance(2);
    inst.setDataset(model);
    inst.setValue(0, 1);
    inst.setValue(1, 100);
    DenseInstance expected = new DenseInstance(2);
    expected.setDataset(model);
    expected.setValue(0, 11);
    expected.setValue(1, 110);
    DenseInstance expected2 = new DenseInstance(2);
    expected2.setDataset(model);
    expected2.setValue(0, 22);
    expected2.setValue(1, 220);
    assertEquals(expected, inst.getAsInstance(model, new FixedRandom(1)));
    assertEquals(expected2, inst.getAsInstance(model, new FixedRandom(11)));
  }
}