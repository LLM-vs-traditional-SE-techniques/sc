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


public class CodexTest_0_6_13 { 
  @Test
  public void testGetAsInstanceRandom() throws Exception {
    int classIdx = 2;
    Instances model = makeModel(classIdx);
    AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
    Random random = new Random(1);
    Instance inst = v.getAsInstance(model, random);
}