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


public class CodexTest_0_4_7 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(this.getClass().getResourceAsStream("/weka/core/Instances.arff"));
    model.setClassIndex(model.numAttributes() - 1);
    DenseInstance inst = new DenseInstance(model.numAttributes());
    inst.setDataset(model);
    inst.setValue(0, 1.0);
    inst.setValue(1, 0.0);
    inst.setValue(2, 2.0);
    inst.setValue(3, "a");
    inst.setValue(4, "b");
    inst.setValue(5, "c");
    inst.setValue(6, "d");
    inst.setValue(7, "e");
    inst.setValue(8, "f");
    inst.setValue(9, "g");
    inst.setValue(10, "h");
    inst.setValue(11, "i");
    inst.setValue(12, "j");
    inst.setValue(13, "k");
    inst.setValue(14, "l");
    inst.setValue(15, "m");
    inst.setValue(16, "n");
    inst.setValue(17, "o");
    inst.setValue(18, "p");
    inst.setValue(19, "q");
    inst.setValue(20, "r");
    inst.setValue(21, "s");
    inst.setValue(22, "t");
    inst.setValue(23, "u");
    inst.setValue(24, "v");
    inst.setValue(25, "w");
    inst.setValue(26, "x");
    inst.setValue(27, "y");
    inst.setValue(28, "z");
    inst.setValue(29, "A");
    inst.setValue(30, "B");
    inst.setValue(31, "C");
    inst.setValue(32, "D");
    inst.setValue(33, "E");
    inst
}