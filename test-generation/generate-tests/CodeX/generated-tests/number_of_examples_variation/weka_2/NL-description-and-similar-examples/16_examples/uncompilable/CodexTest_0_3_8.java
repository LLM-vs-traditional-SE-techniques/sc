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


public class CodexTest_0_3_8 { 
  @Test
  public void testGetAsInstance() {
    Instances insts = new Instances(new BufferedReader(new StringReader(
								       InstancesTest.simpleData)));
    Instance inst = new DenseInstance(insts.numAttributes());
    inst.setDataset(insts);
    inst.setValue(0, 1.0);
    inst.setValue(1, 0.0);
    inst.setValue(2, "second");
    inst.setValue(3, "third");
    inst.setValue(4, "fourth");
    inst.setValue(5, 1.0);
    inst.setValue(6, 1.0);
    inst.setValue(7, 1.0);
    inst.setValue(8, 1.0);
    inst.setValue(9, 1.0);
    inst.setValue(10, 1.0);
    inst.setValue(11, 1.0);
    inst.setValue(12, 1.0);
    inst.setValue(13, 1.0);
    inst.setValue(14, 1.0);
    inst.setValue(15, 1.0);
    inst.setValue(16, 1.0);
    inst.setValue(17, 1.0);
    inst.setValue(18, 1.0);
    inst.setValue(19, 1.0);
    inst.setValue(20, 1.0);
    inst.setValue(21, 1.0);
    inst.setValue(22, 1.0);
    inst.setValue(23, 1.0);
    inst.setValue(24, 1.0);
    inst.setValue(25, 1.0);
    inst.setValue(26, 1.0);
    inst.setValue(27, 1.0);
    inst.setValue(28, 1.0);
    inst.setValue(29, 1.0);
    inst.setValue(30, 1.0);
    inst.setValue(31, 1.0);
    inst.setValue(32, 1.
}