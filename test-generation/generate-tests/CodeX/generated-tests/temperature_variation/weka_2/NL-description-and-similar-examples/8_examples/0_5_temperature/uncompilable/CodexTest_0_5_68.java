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


public class CodexTest_0_5_68 { 
  @Test
  public void testGetAsInstance() {
    int numAtt = 3;
    int numVals = 2;
    int numInst = 2;
    Random rand = new Random(42);
    Instances insts = new Instances(new BufferedReader(new StringReader(
	"A,B,C\n" +
	"1,2,3\n" +
	"4,5,6")));
    insts.setClassIndex(2);
    AlgVector v = new AlgVector(new double[]{7.0, 8.0, 9.0});
    Instance inst = v.getAsInstance(insts, rand);
    assertEquals("#atts", numAtt, inst.numAttributes());
    assertEquals("#vals", numVals, inst.attribute(0).numValues());
    assertEquals("#inst", numInst, inst.numInstances());
  }
}