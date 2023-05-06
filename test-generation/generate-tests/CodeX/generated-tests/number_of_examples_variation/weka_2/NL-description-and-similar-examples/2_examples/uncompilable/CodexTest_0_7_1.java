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
  public void testGetAsInstance() throws Exception {
    double[] data = {3.1, 2.3, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new FileReader("data/cpu.arff"));
    Random random = new Random(1);
    Instance newInst = v.getAsInstance(model, random);
    assertEquals("Num Attributes differ", model.numAttributes(), 
      newInst.numAttributes());
    assertEquals("Num Instances differ", model.numInstances(), 
      newInst.numInstances());
    assertEquals("Class Attribute differ", model.classAttribute(), 
      newInst.classAttribute());
    assertEquals("Dataset differ", model, newInst.dataset());
    assertEquals("Weight differs", model.instance(0).weight(), 
      newInst.weight());
    assertEquals("Class index differ", model.classIndex(), newInst.classIndex());
    assertEquals("3.1 differs", data[0], newInst.value(0));
    assertEquals("2.3 differs", data[1], newInst.value(1));
    assertEquals("5.0 differs", data[2], newInst.value(2
}