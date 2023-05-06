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


public class CodexTest_0_8_88 { 
  @Test
  public void getAsInstanceReturn() {
    Instances model = buildInstances();
    Random random = new Random();
    AlgVector v = new AlgVector();
    Instance newInst = v.getAsInstance(model,random);
    assertEquals("Datatypes not compatible", model.numAttributes(), newInst.numAttributes());
  }
}