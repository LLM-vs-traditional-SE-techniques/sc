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


public class CodexTest_0_4_6 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(m_Instances, 0);
    model.setClassIndex(0);
    Instance inst = new DenseInstance(model.numAttributes());
    inst.setDataset(model);
    inst.setValue(0, 1);
    inst.setValue(1, 2);
    inst.setValue(2, 3);
    inst.setValue(3, 4);
    inst.setValue(4, 5);
    inst.setValue(5, 6);
    inst.setValue(6, 7);
    inst.setValue(7, 8);
    inst.setValue(8, 9);
    inst.setValue(9, 10);
    inst.setValue(10, 11);
    inst.setValue(11, 12);
    inst.setValue(12, 13);
    inst.setValue(13, 14);
    inst.setValue(14, 15);
    inst.setValue(15, 16);
    inst.setValue(16, 17);
    inst.setValue(17, 18);
    inst.setValue(18, 19);
    inst.setValue(19, 20);
    inst.setValue(20, 21);
    inst.setValue(21, 22);
    inst.setValue(22, 23);
    inst.setValue(23, 24);
    inst.setValue(24, 25);
    inst.setValue(25, 26);
    inst.setValue(26, 27);
    inst.setValue(27, 28);
    inst.setValue(28, 29);
    inst.setValue(29, 30);
    inst.setValue(30, 31);
    inst.setValue(31, 32);
    inst.setValue(32, 33);
    inst.setValue(33, 34);
    inst.setValue(34, 35);
    inst.setValue(35, 36);
    inst.setValue(36, 37);
    inst.setValue(37, 38);
    inst.setValue(38, 39);
    inst.setValue(39
}